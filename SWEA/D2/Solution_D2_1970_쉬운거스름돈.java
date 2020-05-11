import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1970_쉬운거스름돈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
		
			int N = Integer.parseInt(st.nextToken());
			
			int[] answer = new int[8];
			
			for(int i=0;i<8;i++) {
				answer[i] = N / money[i];
				
				if(answer[i] == 0) continue;
				
				N -= money[i] * answer[i];
			}
			
			sb.append("#" + tc + "\n");
			for(int i=0;i<8;i++) {
				if(i==7) sb.append(answer[i]);
				else sb.append(answer[i] + " ");
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}