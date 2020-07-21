import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7964_부먹왕국의차원관문 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine(), " ");

			int answer = 0, cnt = D;
			while(st.hasMoreTokens()) {
				int portal = Integer.parseInt(st.nextToken());

				if(portal == 1) cnt = D;
				else {
					cnt--;

					if(cnt == 0) {
						answer++;
						cnt = D;
					}
				}
			}

			System.out.println("#" + tc + " " + answer);
		}
	}
}