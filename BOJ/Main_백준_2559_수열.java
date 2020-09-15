import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2559_수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] temperature = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			temperature[i] = Integer.parseInt(st.nextToken());
		
		int result = 0;
		for(int i=0;i<K;i++)
			result += temperature[i];
		
		int max = result;
		
		// 누적합 계산
		for(int i=K;i<N;i++) {
			result -= temperature[i - K];
			result += temperature[i];
			
			max = max < result ? result : max;
		}
	
		System.out.print(max);
	}
}