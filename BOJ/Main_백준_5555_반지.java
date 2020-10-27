import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main_백준_5555_반지 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine(); int cnt = 0;

		int T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			char[] ring = br.readLine().toCharArray();
			
			LinkedList<Character> queue = new LinkedList<>();
			for(int i=0;i<10;i++)
				queue.offer(ring[i]);
		
			for(int i=1;i<=10;i++) {
				StringBuilder sb = new StringBuilder();
	
				for(int j=0;j<10;j++)
					sb.append(queue.get(j));
				
				if(sb.toString().contains(word)) {
					cnt++;
					break;
				}else queue.offer(queue.poll());
			}
		}

		System.out.print(cnt);
	}
}