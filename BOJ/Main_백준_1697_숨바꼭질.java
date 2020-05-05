package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_1697_숨바꼭질 {
	private static final int DOT = 100000;
	
	private static int bfs(int N, int K){
		Queue<Integer> queue = new LinkedList<>();
		int[] time = new int[DOT + 1];
		int result = 0;
		
		queue.offer(N);
		time[N] = 0;
		
		while(!queue.isEmpty()){
			int X = queue.poll();
			
			if(X == K) {
				result = time[X];
				break;
			}
			
			if(0 <= X - 1 && time[X - 1] == 0) {
				queue.offer(X - 1);
				time[X - 1] = time[X] + 1;
			}
			
			if(X + 1 <= DOT && time[X + 1] == 0){
				queue.offer(X + 1);
				time[X + 1] = time[X] + 1;
			}
			
			if(X * 2 <= DOT && time[X * 2] == 0){
				queue.offer(2 * X);
				time[X * 2] = time[X] + 1;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int answer = bfs(N, K);
		System.out.print(answer);
	}
}