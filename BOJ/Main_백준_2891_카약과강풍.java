import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2891_카약과강풍 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int[] team = new int[N + 1];
		Arrays.fill(team, 1);
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int idx = Integer.parseInt(st.nextToken());
			
			team[idx]--;
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int idx = Integer.parseInt(st.nextToken());
			
			team[idx]++;
		}
		
		for(int i=1;i<=N;i++) {
			if(team[i] == 2) {
				if(1 <= i-1 && team[i-1] == 0) {
					team[i-1]++;
					team[i]--;
				
					continue;
				}
				
				if(i+1 <= N && team[i+1] == 0) {
					team[i+1]++;
					team[i]--;
				}
			}
		}
		
		int cnt = 0;
		for(int i=1;i<=N;i++)
			if(team[i] == 0) cnt++;

		System.out.print(cnt);
	}
}