import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2792_보석상자 {
	public static boolean distribution(long mid, int[] jewelry, int N, int M) {
		int cnt = 0;
		for(int i=0;i<M;i++) {
			cnt += jewelry[i] / mid;
			
			if(jewelry[i] % mid != 0) cnt++;
		}
		
		if(cnt <= N) return true;
		else return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] jewelry = new int[M];
		int max = 0;
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			jewelry[i] = Integer.parseInt(st.nextToken());
			max = max < jewelry[i] ? jewelry[i] : max;
		}
		
		long low = 1, high = max;
		long result = 0;
		while(low <= high) {
			long mid = (low + high) / 2;
			
			if(distribution(mid, jewelry, N, M)) {
				result = mid;
				high = mid - 1;
			}else low = mid + 1;
		}
		
		System.out.print(result);
	}
}