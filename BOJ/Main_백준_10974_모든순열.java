import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10974_모든순열 {
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static StringBuilder sb;
	
	private static void permutation(int n, int r, int depth) {
		if(depth == r) {
			for(int i=0;i<r;i++) {
				if(i == r-1) sb.append(res[i] + "\n");
				else sb.append(res[i] + " ");
			}
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = data[i];
				
				permutation(n, r, depth + 1);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		data = new int[N];
		for(int i=0;i<N;i++)
			data[i] = i + 1;
		
		res = new int[N];
		visit = new boolean[N];
		
		permutation(N, N, 0);
		System.out.print(sb.toString());
	}
}