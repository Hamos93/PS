import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_10580_전봇대 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());

			List<int[]> powerPole = new ArrayList<>();
			while(0 < N--) {
				st = new StringTokenizer(br.readLine(), " ");

				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());

				powerPole.add(new int[] { A, B });
			}

			int cnt = 0;
			for(int i=0;i<powerPole.size();i++) {
				int p1 = powerPole.get(i)[0];
				int p2 = powerPole.get(i)[1];
				
				for(int j=i+1;j<powerPole.size();j++) {
					if(powerPole.get(j)[0] < p1 && p2 < powerPole.get(j)[1]) cnt++;
					if(p1 < powerPole.get(j)[0] && powerPole.get(j)[1] < p2) cnt++;
				}
			}
			
			sb.append("#" + tc + " " + cnt + "\n");
		}
		
		System.out.print(sb.toString());
	}
}