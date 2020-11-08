import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_16953_A화살표B {
	public static void bfs(long A, long B) {
		Queue<long[]> queue = new LinkedList<>();
		Set<Long> hashSet = new HashSet<>();
		
		queue.offer(new long[] { A, 1 });
		hashSet.add(A);
		
		while(!queue.isEmpty()) {
			long[] poll = queue.poll();
			long value = poll[0], cnt = poll[1];
			
			if(value == B) {
				System.out.print(cnt);
				return;
			}

			if(value * 2 <= B && !hashSet.contains(value * 2)) {
				queue.offer(new long[] { value * 2, cnt + 1 });
				hashSet.add(value * 2);
			}
			
			if((value * 10 + 1) <= B && !hashSet.contains(value * 10 + 1)) {
				queue.offer(new long[] { value * 10 + 1, cnt + 1 });
				hashSet.add(value * 10 + 1);
			}
		}
		
		System.out.print("-1");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());

		bfs(A, B);
	}
}