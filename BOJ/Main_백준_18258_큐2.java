import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_18258_큐2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		LinkedList<Integer> queue = new LinkedList<>();

		StringBuilder sb = new StringBuilder();
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String command = st.nextToken();
			switch (command) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				queue.offer(num);
				break;
			case "pop":
				if(queue.isEmpty()) sb.append("-1\n");
				else sb.append(queue.poll() + "\n");
				break;
			case "size":
				sb.append(queue.size() + "\n");
				break;
			case "empty":
				if(queue.isEmpty()) sb.append("1\n");
				else sb.append("0\n");
				break;
			case "front":
				if(queue.isEmpty()) sb.append("-1\n");
				else sb.append(queue.getFirst() + "\n");
				break;
			case "back":
				if(queue.isEmpty()) sb.append("-1\n");
				else sb.append(queue.getLast() + "\n");
				break;
			}
		}
		
		System.out.print(sb.toString());
	}
}