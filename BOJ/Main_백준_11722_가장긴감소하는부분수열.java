import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11722_가장긴감소하는부분수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] A = new int[1001];
		int[] D = new int[1001];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
			D[i] = 1;
		}
		
		int result = 1;
		for(int i=1;i<N;i++) {
			for(int j=0;j<=i;j++) {
				if(A[i] < A[j])
					D[i] = Math.max(D[i], D[j] + 1);
			}
			
			result = Math.max(result, D[i]);
		}
		
		System.out.print(result);
	}
}