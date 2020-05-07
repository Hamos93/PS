import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1945_간단한소인수분해 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int[] primeNumber = new int[] { 2, 3, 5, 7, 11 };
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			int[] answer = new int[5];
			for(int i=0;i<5;i++) {
				while(N % primeNumber[i] == 0) {
					N /= primeNumber[i];
					answer[i]++;
				}
			}
			
			sb.append("#" + tc + " ");
			for(int i=0;i<5;i++) {
				if(i<4) sb.append(answer[i] + " ");
				else sb.append(answer[i]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}