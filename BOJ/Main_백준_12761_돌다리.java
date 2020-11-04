import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_12761_돌다리 {
	public static int bfs(int N, int M, int A, int B) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visit = new boolean[100001];
		int result = 0;
		
		queue.offer(new int[] { N, 0 });
		visit[N] = true;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int stone = poll[0], cnt = poll[1];
			
			if(stone == M) {
				result = cnt;
				break;
			}
			
			if(0 <= stone - 1 && !visit[stone - 1]) {
				queue.offer(new int[] { stone - 1, cnt + 1 });
				visit[stone - 1] = true;
			}
			
			if(stone + 1 <= 100000 && !visit[stone + 1]) {
				queue.offer(new int[] { stone + 1, cnt + 1 });
				visit[stone + 1] = true;
			}
			
			if(0 <= stone - A && !visit[stone - A]) {
				queue.offer(new int[] { stone - A, cnt + 1 });
				visit[stone - A] = true;
			}

			if(stone + A <= 100000 && !visit[stone + A]) {
				queue.offer(new int[] { stone + A, cnt + 1 });
				visit[stone + A] = true;
			}
			
			if(0 <= stone - B && !visit[stone - B]) {
				queue.offer(new int[] { stone - B, cnt + 1 });
				visit[stone - B] = true;
			}

			if(stone + B <= 100000 && !visit[stone + B]) {
				queue.offer(new int[] { stone + B, cnt + 1 });
				visit[stone + B] = true;
			}
			
			if(stone * A <= 100000 && !visit[stone * A]) {
				queue.offer(new int[] { stone * A, cnt + 1 });
				visit[stone * A] = true;
			}
			
			if(stone * B <= 100000 && !visit[stone * B]) {
				queue.offer(new int[] { stone * B, cnt + 1 });
				visit[stone * B] = true;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		System.out.print(bfs(N, M, A, B));
	}
}