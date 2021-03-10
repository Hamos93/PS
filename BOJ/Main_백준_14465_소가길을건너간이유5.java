import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14465_소가길을건너간이유5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
	
		boolean[] trafficLight = new boolean[N + 1];
		while(0 < B--) {
			st = new StringTokenizer(br.readLine(), " ");
			trafficLight[Integer.parseInt(st.nextToken())] = true;
		}
		
		int cnt = 0;
		for(int i=1;i<=K;i++)
			if(trafficLight[i]) cnt++;
		
		int result = cnt;
		for(int i=1;i<=N-K;i++) {
			if(trafficLight[i]) cnt--;
			if(trafficLight[i + K]) cnt++;
			
			result = Math.min(result, cnt);
		}
		
		System.out.print(result);
	}		
}