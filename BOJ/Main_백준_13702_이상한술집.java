import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13702_이상한술집 {
	public static boolean distribution(int mid, int[] kettle, int N, int K) {
		int cnt = 0;
		for(int i=0;i<N;i++)
			cnt += kettle[i] / mid;

		if(K <= cnt) return true;
		else return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
	
		int[] kettle = new int[N];
		int max = 0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			kettle[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, kettle[i]);
		}
		
		int low = 1, high = max;
		int result = 0;
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(distribution(mid, kettle, N, K)) {
				result = mid;
				low = mid + 1;
			}else high = mid - 1;
		}
		
		System.out.print(result);
	}
}