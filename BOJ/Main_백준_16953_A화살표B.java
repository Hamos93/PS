import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_16953_A화살표B {
	private static long answer;
	
	public static void bfs(long A, long B) {
		Queue<long[]> queue = new LinkedList<>();
		Set<String> hashSet = new HashSet<>();
		
		queue.offer(new long[] { A, 1 });
		hashSet.add(Long.toString(A));
		
		while(!queue.isEmpty()) {
			long[] poll = queue.poll();
			long value = poll[0], cnt = poll[1];
			
			if(value == B) {
				answer = cnt;
				return;
			}

			String str = Long.toString(value * 2);
			if(value * 2 <= B && !hashSet.contains(str)) {
				queue.offer(new long[] { value * 2, cnt + 1 });
				hashSet.add(str);
			}
			
			str = Long.toString(value);
			str += 1;
			
			long temp = Long.parseLong(str);
			if(temp <= B && !hashSet.contains(str)) {
				queue.offer(new long[] { temp, cnt + 1 });
				hashSet.add(str);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());

		answer = -1;
		bfs(A, B);
		
		System.out.print(answer);
	}
}