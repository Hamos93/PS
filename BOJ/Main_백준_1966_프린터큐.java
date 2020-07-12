import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_1966_프린터큐 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> queue = new LinkedList<>();
			st = new StringTokenizer(br.readLine(), " ");
	
			int num = 0;
			while(st.hasMoreTokens()) queue.offer(new int[] { Integer.parseInt(st.nextToken()), num++ });
		
			int cnt = 0;
			loop: while(true) {
				int importance = queue.peek()[0];
				
				boolean flag = true;
				for(int i=1;i<queue.size();i++) {
					if(importance < queue.get(i)[0]) {
						flag = false;
						break;
					}
				}
				
				if(!flag) {
					queue.offer(queue.poll());
					continue loop;
				}
				
				int idx = queue.poll()[1];
				cnt++;
				
				if(idx == M) {
					System.out.println(cnt);
					break loop;
				}
			}
		}
	}
}