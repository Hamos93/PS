import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_8821_적고지우기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
	
			boolean[] visit = new boolean[10];
			String number = st.nextToken().trim();
			for(int i=0;i<number.length();i++) {
				int value = number.charAt(i) - '0';
				
				if(!visit[value]) visit[value] = true;
				else visit[value] = false;
			}
			
			int answer = 0;
			for(int i=0;i<10;i++)
				if(visit[i]) answer++;
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}