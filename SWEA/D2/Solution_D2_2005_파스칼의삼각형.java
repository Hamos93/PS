import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_2005_파스칼의삼각형 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			int[][] pascal = new int[N][N];

			for(int i=0;i<N;i++)
				pascal[i][0] = 1;

			sb.append("#" + tc + "\n");
			sb.append(pascal[0][0] + "\n");
			for(int i=1;i<N;i++) {
				sb.append(pascal[i][0] + " ");
				for(int j=1;j<N;j++) {
					pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];

					if(pascal[i][j] != 0) sb.append(pascal[i][j] + " ");
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
	}
}