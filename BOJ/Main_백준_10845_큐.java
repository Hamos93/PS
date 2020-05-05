import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_10845_큐 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
	
		while(N-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			String command = st.nextToken();
			
			if(command.equals("push")) {
				int value = Integer.parseInt(st.nextToken());
				queue.offer(value);
			}
			
			if(command.equals("pop")) {
				if(queue.isEmpty()) System.out.println("-1");
				else System.out.println(queue.poll());
			}
			
			if(command.equals("size")) System.out.println(queue.size());
		
			if(command.equals("empty")) {
				if(queue.isEmpty()) System.out.println("1");
				else System.out.println("0");
			}
			
			if(command.equals("front")) {
				if(queue.isEmpty()) System.out.println("-1");
				else System.out.println(queue.getFirst());
			}
			
			if(command.equals("back")) { 
				if(queue.isEmpty()) System.out.println("-1");
				else System.out.println(queue.getLast());
			}
		}
	}
}