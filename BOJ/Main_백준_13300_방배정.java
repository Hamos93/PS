import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13300_방배정 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] room = new int[7][2];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int S = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			
			room[Y][S]++;
		}
		
		int result = 0;
		for(int i=1;i<=6;i++) {
			for(int j=0;j<=1;j++) {
				int cnt = room[i][j] / K;
				room[i][j] -= K * cnt;
				
				if(room[i][j] != 0 ) cnt++;

				result += cnt;
			}
		}
		
		System.out.print(result);
	}
}