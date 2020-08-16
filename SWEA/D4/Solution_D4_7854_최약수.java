import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_7854_최약수 {
	public static void main(String[] args) throws Exception {
		// 자릿수별 최약수
		int[] data1 = { 1, 2, 5 };
		int[] data2 = { 10, 20, 25, 50 };
		int[] data3 = { 100, 125, 200, 250, 500 };
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String str = br.readLine().trim();
			int len = str.length();

			int X = Integer.parseInt(str);
			int cnt = 0;

			if(len == 1) {
				for(int i=0;i<data1.length;i++)
					if(data1[i] <= X) cnt++;
			}else if(len == 2) {
				cnt += data1.length;
				
				for(int i=0;i<data2.length;i++)
					if(data2[i] <= X) cnt++;
			}else {
				// 세 자리 이상인 경우 [3 + 4 + 5(len - 3) + a]가 성립
				// 3 + 4 + 5(len - 3)
				cnt += data1.length + data2.length;
				
				for(int i=0;i<len-3;i++)
					cnt += 5;
				
				// a
				int front = Integer.parseInt(str.substring(0, 3));
				for(int i=0;i<data3.length;i++)
					if(data3[i] <= front) cnt++;
			}
			
			sb.append("#" + tc + " " + cnt + "\n");
		}
		
		System.out.print(sb.toString());
	}
}