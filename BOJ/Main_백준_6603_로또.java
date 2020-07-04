import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_6603_로또 {
	private static int[] S;
	private static int[] res;
	private static boolean[] visit;
	private static StringBuilder sb;
	
	private static void combination(int n, int r, int depth, int start) {
		if(depth == r) {
			for(int i=0;i<r;i++) {
				if(i == r-1) sb.append(res[i] + "\n");
				else sb.append(res[i] + " ");
			}
			
			return;
		}
		
		for(int i=start;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = S[i];
				
				combination(n, r, depth + 1, i);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int k = Integer.parseInt(st.nextToken());
			if(k == 0) break;
			
			S = new int[k];
			for(int i=0;i<k;i++)
				S[i] = Integer.parseInt(st.nextToken());
			
			res = new int[6];
			visit = new boolean[k];
			
			combination(k, 6, 0, 0);
			
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}