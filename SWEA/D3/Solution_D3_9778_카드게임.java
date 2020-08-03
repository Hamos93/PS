import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_9778_카드게임 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			int[] card = { 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 16, 4 };

			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			while(0 < N--) {
				st = new StringTokenizer(br.readLine(), " ");

				int num = Integer.parseInt(st.nextToken());
				card[num]--;

				sum += num;
			}

			if(21 <= sum) {
				System.out.println("#" + tc + " STOP");
				continue;
			}else {
				if(sum + 11 < 21) {
					System.out.println("#" + tc + " GAZUA");
					continue;
				}
				
				int standard = 21, cnt1 = 0, cnt2 = 0;
				
				for(int i=standard-sum+1;i<=11;i++)
					cnt1 += card[i];
				
				for(int i=2;i<=standard-sum;i++)
					cnt2 += card[i];
			
				if(cnt2 <= cnt1) System.out.println("#" + tc + " STOP");
				else System.out.println("#" + tc + " GAZUA");
			}
		}
	}
}