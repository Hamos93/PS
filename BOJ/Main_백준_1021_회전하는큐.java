import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_1021_회전하는큐 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> deque = new LinkedList<>();
		for(int i=1;i<=N;i++)
			deque.offer(i);

		int cnt = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken());
			
			int idx = -1;
			for(int i=0;i<deque.size();i++) {
				if(deque.get(i) == value) {
					idx = i;
					break;
				}
			}
			
			int res1 = idx;
			int res2 = deque.size() - idx;
			
			if(res1 <= res2) {
				cnt += res1;
				
				while(0 < res1--)
					deque.offer(deque.pollFirst());
			}else {
				cnt += res2;
				
				while(0 < res2--)
					deque.offerFirst(deque.pollLast());
			}
			
			deque.poll();
		}
		
		System.out.print(cnt);
	}
}