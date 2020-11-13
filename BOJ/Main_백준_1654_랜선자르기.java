import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1654_랜선자르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
	
		int[] lan = new int[K];
		int maxLan = 0;
		for(int i=0;i<K;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			lan[i] = Integer.parseInt(st.nextToken());
			
			maxLan = Math.max(lan[i], maxLan);
		}
		
		long low = 1, high = maxLan, answer = 0;
		while(low <= high) {
			long mid = (low + high) / 2;
			long cnt = 0;
			
			for(int i=0;i<K;i++)
				cnt += lan[i] / mid;
			
			if(cnt < N) high = mid - 1;
			else {
				answer = mid;
				low = mid + 1;
			}
		}
		
		System.out.print(answer);
	}
}