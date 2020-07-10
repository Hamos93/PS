import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_2164_카드2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		if(N == 1) {
			System.out.print("1");
			return;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) queue.offer(i);
		
		while(true) {
			queue.poll();
			
			if(queue.size() == 1) {
				System.out.print(queue.poll());
				return;
			}
			
			queue.offer(queue.poll());
		}
	}
}