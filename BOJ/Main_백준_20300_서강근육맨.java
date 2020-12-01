import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_20300_서강근육맨 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		LinkedList<Long> queue = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) queue.offer(Long.parseLong(st.nextToken()));
		
		Collections.sort(queue);
		
		long M = 0;
		if(N % 2 == 1) M = queue.pollLast();
	
		while(!queue.isEmpty()) {
			long loss1 = queue.pollFirst();
			long loss2 = queue.pollLast();
			
			M = M < (loss1 + loss2) ? (loss1 + loss2) : M;
		}
	
		System.out.print(M);
	}
}