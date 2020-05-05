import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_11866_요세푸스문제0 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) queue.offer(i); 
		
		StringBuilder sb = new StringBuilder("<");
		while(!queue.isEmpty()){
			int idx = (K-1) < queue.size() ? (K-1) : (K-1) % queue.size();
			
			while(idx-- > 0){
				int num = queue.poll();
				queue.offer(num);
			}
			
			if(queue.size() == 1) sb.append(queue.poll() + ">");
			else sb.append(queue.poll() + ", ");
		}
		
		System.out.print(sb.toString());
	}
}