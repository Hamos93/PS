import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1859_백만장자프로젝트 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] price = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				price[i] = Integer.parseInt(st.nextToken());
			
			long profit = 0;
			for(int i=N-1;0<=i;i--) {
				int k = i - 1;
				int cnt = 0, purchase = 0;
				while(0 <= k && price[k] < price[i]) {
					cnt++;
					purchase += price[k--];
				}
				
				profit += price[i] * cnt - purchase;
				i = k + 1;
			}
			
			System.out.println("#" + tc + " " + profit);
		}
	}
}