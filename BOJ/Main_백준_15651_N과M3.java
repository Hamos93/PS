import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_15651_N과M3 {
	private static int[] data;
	private static int[] res;
	private static StringBuilder sb;
	
	private static void product(int n, int m, int depth) {
		if(depth == m) {
			for(int i=0;i<m;i++) {
				if(i == m-1) sb.append(res[i]);
				else sb.append(res[i] + " ");
			}
			
			sb.append("\n");
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			res[depth] = data[i];
			product(n, m, depth + 1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		data = new int[N];
		for(int i=0;i<N;i++)
			data[i] = i + 1;
		
		res = new int[M];
		
		product(N, M, 0);
		
		System.out.print(sb.toString());
	}
}