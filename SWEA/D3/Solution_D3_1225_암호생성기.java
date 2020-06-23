import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_D3_1225_암호생성기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int t = Integer.parseInt(st.nextToken());
			
			Queue<Integer> queue = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) queue.offer(Integer.parseInt(st.nextToken()));
			
			int cnt = 1;
			boolean flag = false;
			
			while(true) {
				int value = queue.poll() - cnt;
				
				if(value <= 0) {
					flag = true;
					value = 0;
				}
				
				queue.offer(value);
				
				if(flag) break;
				
				cnt++;
				if(5 < cnt) cnt = 1;
			}
		
			System.out.print("#" + tc + " ");
			while(!queue.isEmpty()) {
				if(queue.size() == 1) System.out.print(queue.poll());
				else System.out.print(queue.poll() + " ");
			}
			
			System.out.println();
		}
	}
}