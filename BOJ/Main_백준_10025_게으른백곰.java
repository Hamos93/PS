import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10025_게으른백곰 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr =  new int[1000001];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int g = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
		
			arr[x] = g;
		}
		
		int sum = 0, result = 0;
		for(int i=0;i<=1000000;i++) {
			if((2 * K + 1) <= i) sum -= arr[i - (2 * K + 1)];
			sum += arr[i];
			
			result = Math.max(result, sum);
		}

		System.out.print(result);
	}
}