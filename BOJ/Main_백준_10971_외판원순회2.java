import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10971_외판원순회2 {
	private static int[][] W;
	private static int[] TSP;
	private static int[] res;
	private static boolean[] visit;
	private static int answer;

	private static void permutation(int n, int r, int depth) {
		if(depth == r) {
			int sum = 0;
			
			for(int i=0;i<r-1;i++) {
				if(W[res[i]][res[i+1]] == 0) return;
	
				sum += W[res[i]][res[i+1]];
			}
			
			if(W[res[r-1]][res[0]] == 0) return;
			
			sum += W[res[r-1]][res[0]];

			answer = sum < answer ? sum : answer;
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = TSP[i];
				
				permutation(n, r, depth + 1);
				
				visit[i] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		W = new int[N][N];

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++)
				W[i][j] = Integer.parseInt(st.nextToken());
		}

		TSP = new int[N];
		for(int i=0;i<N;i++)
			TSP[i] = i;

		res = new int[N];
		visit = new boolean[N];

		answer = Integer.MAX_VALUE;
		permutation(N, N, 0);

		System.out.print(answer);
	}
}