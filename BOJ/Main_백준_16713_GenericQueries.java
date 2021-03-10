import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_16713_GenericQueries {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		int[] a = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			a[i] = Integer.parseInt(st.nextToken());
		
		int[] P = new int[N + 1];
		int result = 0;
		
		for(int i=0;i<N;i++) {
			result ^= a[i];
			P[i + 1] = result;
		}
		
		int answer = 0;
		while(0 < Q--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			answer ^= (P[e] ^ P[s-1]);
		}
		
		System.out.print(answer);
	}
}