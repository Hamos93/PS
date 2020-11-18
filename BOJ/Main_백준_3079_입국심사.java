import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_3079_입국심사 {
	public static boolean possible(long mid, int[] counter, int N, int M) {
		long cnt = 0;
		for(int i=0;i<N;i++)
			cnt += mid / counter[i];
	
		return M <= cnt;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] counter = new int[N];
		long max = 0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
		
			counter[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, counter[i]);
		}
		
		long low = 1, high = max * M;
		long result = high;
		while(low <= high) {
			long mid = (low + high) / 2;
			
			if(possible(mid, counter, N, M)) {
				result = Math.min(result, mid);
				high = mid - 1;
			}else low = mid + 1;
		}
		
		System.out.print(result);
	}
}