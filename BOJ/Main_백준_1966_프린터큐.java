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
			for(int i=0;i<N;i++) {
				int importance = Integer.parseInt(st.nextToken());
				
				if(i != M) queue.offer(new int[] { importance, 0 });
				else queue.offer(new int[] { importance, 1 });
			}
			
			int order = 0;
			while(!queue.isEmpty()) {
				int importance = queue.peek()[0];
				
				boolean flag = false;
				for(int i=1;i<queue.size();i++) {
					if(importance < queue.get(i)[0]) {
						flag = true;
						break;
					}
				}
				
				if(flag) {
					queue.offer(queue.poll());
					continue;
				}
				
				int print = queue.poll()[1];
				order++;
				
				if(print == 1) break;
			}
			
			System.out.println(order);
		}
	}
}