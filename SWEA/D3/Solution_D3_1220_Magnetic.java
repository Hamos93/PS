import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1220_Magnetic {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[][] table = new int[N][N];
			
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<N;j++)
					table[i][j] = Integer.parseInt(st.nextToken());
			}
			
			int deadlock = 0;
			for(int j=0;j<N;j++) {
				int flag = 0;
				for(int i=0;i<N;i++) {
					if(table[i][j] == 1) flag = 1;
					if(flag == 1 && table[i][j] == 2) {
						deadlock++;
						flag = 0;
					}
				}
			}
			
			System.out.println("#" + tc + " " + deadlock);
		}
	}
}