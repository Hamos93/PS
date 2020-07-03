import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_15654_N과M5 {
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static StringBuilder sb;
	
	private static void permutation(int n, int m, int depth) {
		if(depth == m) {
			for(int i=0;i<m;i++) {
				if(i == m-1) sb.append(res[i]);
				else sb.append(res[i] + " ");
			}
			
			sb.append("\n");
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = data[i];
				
				permutation(n, m, depth + 1);
				
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
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			data[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(data);
		
		res = new int[M];
		visit = new boolean[N];
	
		permutation(N, M, 0);
		System.out.print(sb.toString());
	}
}