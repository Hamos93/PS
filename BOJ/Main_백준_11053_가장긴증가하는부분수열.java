import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_11053_가장긴증가하는부분수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		int[] D = new int[N];
		Arrays.fill(D, 1);
		
		int len = 1;
		for(int i=1;i<N;i++) {
			for(int j=0;j<=i;j++) {
				if(A[j] < A[i]) 
					D[i] = Math.max(D[i], D[j] + 1);
			}
			
			len = Math.max(len, D[i]);
		}
		
		System.out.print(len);
	}
}