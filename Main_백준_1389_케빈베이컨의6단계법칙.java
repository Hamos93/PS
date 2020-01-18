package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_1389_케빈베이컨의6단계법칙 {
	private static int N;
	private static int[][] graph;

	private static int bfs(int i, int j){
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visit = new boolean[N+1];
		int cnt = 0;

		queue.offer(new int[]{i, 0});
		visit[i] = true;

		while(!queue.isEmpty()){
			int[] poll = queue.poll();
			int curr = poll[0];
			int distance = poll[1]; 

			if(curr == j){
				cnt = distance;
				break;
			}

			for(int next=1;next<N+1;next++){
				if(!visit[next] && graph[curr][next] == 1){
					queue.offer(new int[]{next, distance + 1});
					visit[next] = true;
				}
			}
		}

		return cnt;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		graph = new int[N+1][N+1];
		while(M-- > 0){
			st = new StringTokenizer(br.readLine(), " ");

			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph[u][v] = graph[v][u] = 1;
		}

		int[] kevinBacon = new int[N+1];
		for(int i=1;i<N+1;i++){
			for(int j=1;j<N+1;j++){
				if(j == i) continue;

				int result = bfs(i, j);
				kevinBacon[i] += result;
			}
		}

		int value = Integer.MAX_VALUE;
		int answer = 0;
		for(int i=1;i<N+1;i++){
			if(kevinBacon[i] < value){
				value = kevinBacon[i];
				answer = i;
			}
		}

		System.out.print(answer);
	}
}