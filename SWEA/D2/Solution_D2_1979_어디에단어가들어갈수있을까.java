import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[][] puzzle = new int[N][N];
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<N;j++)
					puzzle[i][j] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(puzzle[i][j] == 1) {
						int cnt = 1;
						
						while(++j < N && puzzle[i][j] == 1) cnt++;
						
						if(cnt == K) answer++;
					}
				}
			}
			
			for(int j=0;j<N;j++) {
				for(int i=0;i<N;i++) {
					if(puzzle[i][j] == 1) {
						int cnt = 1;
						
						while(++i < N && puzzle[i][j] == 1) cnt++;
						
						if(cnt == K) answer++;
					}
				}
			}
			
			sb.append("#" + tc + " " + answer + "\n");
		}
		
		System.out.print(sb.toString());
	}
}