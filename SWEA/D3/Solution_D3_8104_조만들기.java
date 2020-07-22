import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_8104_조만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int[][] team = new int[N][K];

			int cnt = 1; boolean odd = false;
			for(int i=0;i<N;i++) {
				if(!odd) {
					for(int j=0;j<K;j++)
						team[i][j] = cnt++;

					odd = true;
				}else {
					for(int j=K-1;0<=j;j--)
						team[i][j] = cnt++;

					odd = false;
				}
			}

			sb.append("#" + tc + " ");

			for(int j=0;j<K;j++) {
				int sum = 0;

				for(int i=0;i<N;i++)
					sum += team[i][j];

				if(j == K-1) sb.append(sum + "\n");
				else sb.append(sum + " ");
			}
		}

		System.out.print(sb.toString());
	}
}