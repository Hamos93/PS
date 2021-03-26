import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_5430_AC {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			char[] P = br.readLine().toCharArray();
			int len = P.length;

			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());

			Deque<Integer> deque = new LinkedList<Integer>();

			st = new StringTokenizer(br.readLine(), "[,]");
			for(int i=0;i<n;i++)
				deque.offer(Integer.parseInt(st.nextToken()));

			boolean front = true, flag = true;
			for(int i=0;i<len;i++) {
				if(P[i] == 'R') front = !front; 
				else {
					if(deque.isEmpty()) {
						flag = false;
						sb.append("error\n");

						break;
					}

					if(front) deque.pollFirst();
					else deque.pollLast();
				}
			}

			if(flag) {
				sb.append("[");
				
				if(front) {
					while(!deque.isEmpty()) 
						sb.append(deque.pollFirst() + ",");
				}

				if(!front) {
					while(!deque.isEmpty()) 
						sb.append(deque.pollLast() + ",");
				}

				if(sb.charAt(sb.length() - 1) == ',') sb.deleteCharAt(sb.length() - 1);

				sb.append("]\n");
			}
		}

		System.out.print(sb.toString().trim());
	}
}