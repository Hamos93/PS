import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_4047_영준이의카드카운팅 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		loop: for(int tc=1;tc<=T;tc++) {
			String line = br.readLine().trim();

			boolean[][] card = new boolean[4][14];
			boolean flag = true;
			for(int i=0;i<line.length();i+=3) {
				int num = Integer.parseInt(line.substring(i+1, i+3));

				switch (line.charAt(i)) {
				case 'S':
					if(!card[0][num]) card[0][num] = true;
					else flag = false;
					break;
				case 'D':
					if(!card[1][num]) card[1][num] = true;
					else flag = false;
					break;
				case 'H':
					if(!card[2][num]) card[2][num] = true;
					else flag = false;
					break;
				case 'C':
					if(!card[3][num]) card[3][num] = true;
					else flag = false;
					break;
				}
				
				if(!flag) {
					System.out.println("#" + tc + " ERROR");
					continue loop;
				}
			}
			
			int[] answer = new int[4];
			for(int i=0;i<4;i++) {
				for(int j=1;j<14;j++)
					if(!card[i][j]) answer[i]++;
			}
			
			System.out.print("#" + tc + " ");
			for(int i=0;i<4;i++) {
				if(i == 3) System.out.println(answer[i]);
				else System.out.print(answer[i] + " ");
			}
		}
	}
}