package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_11403_경로찾기 {
	private static int N;
	private static int[][] G;
	private static boolean[] visit;
	private static List<Integer> list;

	private static void dfs(int node){
		for(int next=0;next<N;next++){
			if(!visit[next] && G[node][next] == 1) {
				visit[next] = true;
			
				list.add(next);
				
				dfs(next);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		G = new int[N][N];

		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++)
				G[i][j] = Integer.parseInt(st.nextToken());
		}

		list = new ArrayList<>();
		for(int i=0;i<N;i++){
			visit = new boolean[N];

			dfs(i);
			for(int j=0;j<list.size();j++)
				G[i][list.get(j)] = 1;
			
			list.clear();
		}
	
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++)
				System.out.print(G[i][j] + " ");
			System.out.println();
		}
	}
}