import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_10866_덱 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Deque<Integer> queue = new LinkedList<>();

		int N = Integer.parseInt(st.nextToken());
		while(N-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			String command = st.nextToken();
			
			if(command.equals("push_front")) queue.offerFirst(Integer.parseInt(st.nextToken()));
			
			if(command.equals("push_back")) queue.offerLast(Integer.parseInt(st.nextToken()));
			
			if(command.equals("pop_front")) {
				if(!queue.isEmpty()) System.out.println(queue.pollFirst());
				else System.out.println("-1");
			}
			
			if(command.equals("pop_back")) {
				if(!queue.isEmpty()) System.out.println(queue.pollLast());
				else System.out.println("-1");
			}
			
			if(command.equals("size")) System.out.println(queue.size());
		
			if(command.equals("empty")) {
				if(!queue.isEmpty()) System.out.println("0");
				else System.out.println("1");
			}
			
			if(command.equals("front")) {
				if(!queue.isEmpty()) System.out.println(queue.peekFirst());
				else System.out.println("-1");
			}
			
			if(command.equals("back")) {
				if(!queue.isEmpty()) System.out.println(queue.peekLast());
				else System.out.println("-1");
			}
		}
	}
}