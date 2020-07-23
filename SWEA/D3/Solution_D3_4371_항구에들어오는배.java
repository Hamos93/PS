import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_4371_항구에들어오는배 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] day = new int[N];
			boolean[] flag = new boolean[N];
			
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				day[i] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = 0;
			for(int i=1;i<N;i++) {
				if(!flag[i]) {
					flag[i] = true;
					cnt++;
					
					int interval = day[i];
					for(int j=i+1;j<N;j++) {
						if(day[j] - interval == day[i] - day[0]) {
							flag[j] = true;
							
							interval = day[j];
						}
					}
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
		}
	}
}