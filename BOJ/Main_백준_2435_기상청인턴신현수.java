import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2435_기상청인턴신현수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		int sum = 0;

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i < K) sum += arr[i];
		}
		
		int temperature = sum;
		for(int i=0;i<N-K;i++) {
			sum -= arr[i];
			sum += arr[i + K];
			
			temperature = Math.max(temperature, sum);
		}

		System.out.print(temperature);
	}
}