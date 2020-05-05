import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_6603_로또 {
	private static int[] data;
	private static int[] lotto;
	private static boolean[] visit;
	
	private static void combination(int n, int r, int depth, int start) {
		if(depth == r) {
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<r;i++)
				sb.append(lotto[i] + " ");
			System.out.println(sb.toString());
			
			return;
		}
		
		for(int i=start;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				lotto[depth] = data[i];
				
				combination(n, r, depth + 1, i);

				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int K = Integer.parseInt(st.nextToken());

			if(K == 0) break;
			
			data = new int[K];
			lotto = new int[6];
			visit = new boolean[K];
			
			for(int i=0;i<K;i++)
				data[i] = Integer.parseInt(st.nextToken());
			
			combination(K, 6, 0, 0);
			System.out.println();
		}
	}
}
