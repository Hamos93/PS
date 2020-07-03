import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_15650_N과M2 {
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static StringBuilder sb;
	
	private static void combination(int n, int m, int depth, int start) {
		if(depth == m) {
			for(int i=0;i<m;i++) {
				if(i == m-1) sb.append(res[i]);
				else sb.append(res[i] + " ");
			}
			
			sb.append("\n");
			
			return;
		}
		
		for(int i=start;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = data[i];
				
				combination(n, m, depth + 1, i);
				
				visit[i] = false;
			}
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
		visit = new boolean[N];
		
		combination(N, M, 0, 0);
		System.out.print(sb.toString());
	}
}