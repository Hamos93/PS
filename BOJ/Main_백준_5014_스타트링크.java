import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_5014_스타트링크 {
	public static void bfs(int F, int S, int G, int U, int D) {
		Queue<int[]> queue = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		
		queue.offer(new int[] { S, 0 });
		set.add(S);
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int floor = poll[0], cnt = poll[1]; 
		
			if(floor == G) {
				System.out.print(cnt);
				return;
			}
			
			if(floor + U <= F && !set.contains(floor + U)) {
				queue.offer(new int[] { floor + U, cnt + 1 });
				set.add(floor + U);
			}
			
			if(1 <= floor - D && !set.contains(floor - D)) {
				queue.offer(new int[] { floor - D, cnt + 1 });
				set.add(floor - D);
			}
		}
		
		System.out.print("use the stairs");
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int F = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		bfs(F, S, G, U, D);
	}
}