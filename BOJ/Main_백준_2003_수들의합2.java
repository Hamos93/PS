import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2003_수들의합2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		int[] A = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		int sum = 0, j = 0, cnt = 0;
		for(int i=0;i<N;i++) {
			while(sum < M && j < N) {
				sum += A[j];
				j++;
			}
			
			if(sum == M) cnt++;
			
			sum -= A[i];
		}
		
		System.out.print(cnt);
	}
}