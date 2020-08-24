import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D4_4050_재관이의대량할인 {
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
			
			Arrays.sort(price);
			
			int total = 0, cnt = 1;
			for(int i=N-1;0<=i;i--) {
				if(cnt == 3) {
					cnt = 1;
					continue;
				}
				
				total += price[i];
				cnt++;
			}
			
			System.out.println("#" + tc + " " + total);
		}
	}
}