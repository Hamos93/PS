import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_2805_농작물수확하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[][] farm = new int[N][N];
			
			for(int i=0;i<N;i++) {
				String line = br.readLine();
				for(int j=0;j<N;j++)
					farm[i][j] = line.charAt(j) - '0';
			}
			
			int answer = 0, k1 = 1;
			for(int i=N/2-k1;0<=i;i--) {
				for(int j=k1;j<N-k1;j++)
					answer += farm[i][j];
				
				k1++;
			}
			
			for(int j=0;j<N;j++)
				answer += farm[N/2][j];
			
			int k2 = 1;
			for(int i=N/2+k2;i<N;i++) {
				for(int j=k2;j<N-k2;j++)
					answer += farm[i][j];
				
				k2++;
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}