import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1493_수의새로운연산 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 300;

		int[][] arr = new int[N + 1][N + 1];
		
		int cnt1 = 1;
		for(int j=1;j<N+1;j++) {
			arr[1][j] = arr[1][j - 1] + cnt1;
			cnt1++;
		}
		
		for(int i=2;i<N+1;i++) {
			int cnt2 = i - 1; 
			for(int j=1;j<N+1;j++) {
				arr[i][j] = arr[i - 1][j] + cnt2;
				cnt2++;
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
		
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
		
			int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
			loop: for(int i=1;i<N+1;i++) {
				for(int j=1;j<N+1;j++) {
					if(arr[i][j] == p) {
						x1 = i;
						y1 = j;
						
						break loop;
					}
				}
			}
			
			loop: for(int i=1;i<N+1;i++) {
				for(int j=1;j<N+1;j++) {
					if(arr[i][j] == q) {
						x2 = i;
						y2 = j;
						
						break loop;
					}
				}
			}

			System.out.println("#" + tc + " " + arr[x1 + x2][y1 + y2]);
		}
	}
}