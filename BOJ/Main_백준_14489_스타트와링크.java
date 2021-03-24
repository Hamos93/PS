import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_14489_스타트와링크 {
	private static int[][] stats;
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static int min;

	public static void combination(int N, int R, int depth, int start) {
		if(depth == R) {
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<N;i++) {
				if(!visit[i]) 
					list.add(data[i]);
			}
			
			int S = 0, L = 0;
			for(int i=0;i<R;i++) {
				for(int j=i+1;j<R;j++) 
					S += (stats[res[i]][res[j]] + stats[res[j]][res[i]]);
			}
			
			for(int i=0;i<R;i++) {
				for(int j=i+1;j<R;j++)
					L += (stats[list.get(i)][list.get(j)] + stats[list.get(j)][list.get(i)]);
			}
			
			min = Math.abs(S - L) < min ? Math.abs(S - L) : min;
			
			return;
		}
		
		for(int i=start;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = data[i];
				
				combination(N, R, depth + 1, i);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		stats = new int[N+1][N+1];

		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1;j<=N;j++)
				stats[i][j] = Integer.parseInt(st.nextToken());
		}

		data = new int[N];
		for(int i=0;i<N;i++)
			data[i] = i + 1;

		res = new int[N/2];
		visit = new boolean[N];

		min = Integer.MAX_VALUE;
		combination(N, N/2, 0, 0);

		System.out.print(min);
	}
}