import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_17390_이건꼭풀어야해 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(A);
		
		int[] P = new int[N + 1];
		int sum = 0;
		
		for(int i=0;i<N;i++) {
			sum += A[i];
			P[i + 1] = sum;
		}
		
		StringBuilder sb = new StringBuilder();
		while(0 < Q--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int L = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			
			sb.append((P[R] - P[L-1]) + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}