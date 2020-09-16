import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10157_자리배정 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int[][] hall = new int[R][C];
		
		st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());

		if(R * C < K) {
			System.out.print("0");
			return;
		}
		
		int i = 0, j = -1, num = 1;
		loop: while(true) {
			while(++j < C && hall[i][j] == 0) {
				hall[i][j] = num++;
				
				if(num - 1 == K) break loop;
			}
			
			j--;
			
			while(++i < R && hall[i][j] == 0) {
				hall[i][j] = num++;
				
				if(num - 1 == K) break loop;
			}
			
			i--;
			
			while(0 <= --j && hall[i][j] == 0) {
				hall[i][j] = num++;
				
				if(num - 1 == K) break loop;
			}
			
			j++;

			while(0 <= --i && hall[i][j] == 0) {
				hall[i][j] = num++;
				
				if(num - 1 == K) break loop;
			}
			
			i++;
		}

		System.out.println((i + 1) + " " + (j + 1));
	}
}