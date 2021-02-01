import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_15486_퇴사2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] T = new int[N + 2];
		int[] P = new int[N + 2];
		int[] D = new int[N + 2];

		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=N;1<=i;i--) {
			if(N + 2 <= i + T[i]) D[i] = D[i+1];
			else D[i] = Math.max(D[i+1], D[i + T[i]] + P[i]);
		}
		
		System.out.print(D[1]);
	}
}