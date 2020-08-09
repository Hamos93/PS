import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1219_길찾기 {
	private static int[][] graph;
	private static boolean[] visit;
	private static int answer;
	private static final int N = 100;

	private static void dfs(int node) {
		visit[node] = true;
		
		if(node == 99) {
			answer = 1;
			return;
		}
		
		for(int i=0;i<N;i++)
			if(graph[node][i] == 1 && !visit[i]) dfs(i);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken(); st.nextToken();
			
			st = new StringTokenizer(br.readLine(), " ");

			graph = new int[N][N];
			while(st.hasMoreTokens()) graph[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
		
			visit = new boolean[N];
			answer = 0;
			
			dfs(0);

			System.out.println("#" + tc + " " + answer);
		}
	}
}