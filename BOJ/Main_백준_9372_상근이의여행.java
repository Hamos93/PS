package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_9372_상근이의여행 {
	private static int N;
	private static int[][] airplane;
	
	private static int bfs(int nation){
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visit = new boolean[N+1];

		int cnt = 0;
		
		queue.offer(nation);
		visit[nation] = true;
		
		while(!queue.isEmpty()){
			int curr = queue.poll();
			
			for(int next=1;next<=N;next++){
				if(!visit[next] && airplane[curr][next] == 1){
					queue.offer(next);
					visit[next] = true;
			
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			airplane = new int[N+1][N+1];
			while(M-- > 0){
				st = new StringTokenizer(br.readLine(), " ");
				
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				
				airplane[i][j] = airplane[j][i] = 1;
			}
			
			int answer = bfs(1);
			System.out.println(answer);
		}
	}
}