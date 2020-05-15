import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7102_준홍이의카드놀이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[] card = new int[N + M + 1];
			for(int i=1;i<=N;i++)
				for(int j=1;j<=M;j++)
					card[i + j]++;

			int result = Integer.MIN_VALUE;
			for(int i=1;i<N+M+1;i++)
				result = result < card[i] ? card[i] : result;

				StringBuilder sb = new StringBuilder();
				sb.append("#" + tc + " ");
				for(int i=1;i<N+M+1;i++)
					if(result == card[i]) sb.append(i + " ");

				sb.append("\n");
				System.out.print(sb.toString());
		}
	}
}