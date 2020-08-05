import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_1860_진기의최고급붕어빵 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
		
			List<Integer> arrival = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) arrival.add(Integer.parseInt(st.nextToken()));
		
			Collections.sort(arrival);
			
			int cnt = 0; boolean flag = true;
			for(int i=0;i<arrival.size();i++) {
				int second = arrival.get(i);
				
				int fishBread = (second / M) * K - cnt;
				
				if(0 < fishBread) cnt++;
				else {
					flag = false;
					break;
				}
			}
			
			if(flag) System.out.println("#" + tc + " Possible");
			else System.out.println("#" + tc + " Impossible");
		}
	}
}