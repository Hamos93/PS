import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_����_9461_�ĵ������� {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		long[] P = new long[101];
		P[0] = 0;
		P[1] = 1;
		P[2] = 1;

		for(int i=3;i<=100;i++) 
			P[i] = P[i-3] + P[i-2];
		
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			System.out.println(P[N]);
		}
	}
}