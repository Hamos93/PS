import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_16401_과자나눠주기 {
	public static boolean distribution(long mid, int[] snack, int M, int N) {
		int cnt = 0;
		for(int i=0;i<N;i++)
			cnt += snack[i] / mid;
		
		return M <= cnt;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[] snack = new int[N];
		int max = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			snack[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, snack[i]);
		}
		
		long low = 1, high = max;
		long result = 0;
		while(low <= high) {
			long mid = (low + high) / 2;
			
			if(distribution(mid, snack, M, N)) {
				result = mid;
				low = mid + 1;
			}else high = mid - 1;
		}
		
		System.out.print(result);
	}
}