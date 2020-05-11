import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_2001_파리퇴치 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[N][N];
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<N;j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			for(int i1=0;i1<=(N - M);i1++) {
				for(int j1=0;j1<=(N - M);j1++) {
					int result = 0;
					
					for(int i2=i1;i2<(i1 + M);i2++) {
						for(int j2=j1;j2<(j1 + M);j2++) {
							result += map[i2][j2];
						}
					}
					answer = answer < result ? result : answer;
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}