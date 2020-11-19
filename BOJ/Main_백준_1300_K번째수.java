import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1300_K번째수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		
		int low = 1, high = K;
		int result = 0;
		while(low <= high) {
			int mid = (low + high) / 2;
			int sum = 0;
			
			for(int i=1;i<=N;i++)
				sum += Math.min(mid / i, N);
			
			if(K <= sum) {
				result = mid;
				high = mid - 1;
			}else low = mid + 1;
		}

		System.out.print(result);
	}
}