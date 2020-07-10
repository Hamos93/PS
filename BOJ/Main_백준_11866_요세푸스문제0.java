import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_11866_요세푸스문제0 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
	
		LinkedList<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) queue.offer(i);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int idx = K - 1;
		while(true) {
			if(queue.size() == 1) {
				sb.append(queue.get(idx) + ">");
				queue.remove(idx);
				
				System.out.print(sb.toString());
				
				return;
			}else {
				sb.append(queue.get(idx) + ", ");
				queue.remove(idx);
			}
			
			idx += K - 1;
			
			if(queue.size() <= idx) idx %= queue.size();
		}
	}
}