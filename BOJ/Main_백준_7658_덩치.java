import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_7658_덩치 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int[][] body = new int[N][3];

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<2;j++) {
				int value = Integer.parseInt(st.nextToken());

				body[i][j] = value;
			}
		}

		for(int i=0;i<N;i++) {
			int rank = 1;
			for(int j=0;j<N;j++) {
				if(i == j) continue;

				if(body[i][0] < body[j][0] && body[i][1] < body[j][1]) rank++;
			}

			body[i][2] = rank;
		}
		
		for(int i=0;i<N;i++)
			System.out.print(body[i][2] + " ");
	}
}