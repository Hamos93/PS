import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1210_Ladder1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			Integer.parseInt(st.nextToken());
			
			int[][] ladder = new int[100][100];
			int r = 0, c = 0;
			for(int i=0;i<100;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<100;j++) {
					ladder[i][j] = Integer.parseInt(st.nextToken());
					
					if(ladder[i][j] == 2) {
						r = i;
						c = j;
					}
				}
			}
			
			while(r != 0) {
				r--;
				
				while(0 <= c-1 && ladder[r][c-1] == 1) {
					ladder[r][c] = 0;
					c--;
				}
				
				while(c+1 < 100 && ladder[r][c+1] == 1) {
					ladder[r][c] = 0;
					c++;
				}
			}
			
			System.out.println("#" + tc + " " + c);
		}
	}
}