import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_14465_소가길을건너간이유5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		boolean[] light = new boolean[N + 1]; 
		Arrays.fill(light, true);
		
		while(0 < B--) {
			st = new StringTokenizer(br.readLine(), " ");
			light[Integer.parseInt(st.nextToken())] = false;
		}
		
		LinkedList<Integer> queue = new LinkedList<>();
		int cnt = 0;

		for(int i=1;i<=K;i++) {
			queue.offer(i);
			
			if(!light[i]) cnt++;
		}

		int result = cnt;
		for(int i=K+1;i<=N;i++) {
			int idx = queue.poll();
			if(!light[idx]) cnt--;
		
			queue.offer(i);
			if(!light[i]) cnt++;
			
			result = cnt < result ? cnt : result;
		}
		
		System.out.print(result);
	}
}