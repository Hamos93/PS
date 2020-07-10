import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_10866_덱 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		LinkedList<Integer> deque = new LinkedList<>();

		StringBuilder sb = new StringBuilder();
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String command = st.nextToken();
			switch (command) {
			case "push_front":
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if(deque.isEmpty()) sb.append("-1\n");
				else sb.append(deque.pollFirst() + "\n");
				break;
			case "pop_back":
				if(deque.isEmpty()) sb.append("-1\n");
				else sb.append(deque.pollLast() + "\n");
				break;
			case "size":
				sb.append(deque.size() + "\n");
				break;
			case "empty":
				if(deque.isEmpty()) sb.append("1\n");
				else sb.append("0\n");
				break;
			case "front":
				if(deque.isEmpty()) sb.append("-1\n");
				else sb.append(deque.getFirst() + "\n");
				break;
			case "back":
				if(deque.isEmpty()) sb.append("-1\n");
				else sb.append(deque.getLast() + "\n");
				break;
			}
		}
		
		System.out.print(sb.toString());
	}
}