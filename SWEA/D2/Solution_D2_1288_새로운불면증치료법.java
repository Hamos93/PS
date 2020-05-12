import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1288_새로운불면증치료법 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			boolean[] digit = new boolean[10];

			int k = 0;
			while(true) {
				k++;

				String number = Integer.toString(k * N);
				for(int i=0;i<number.length();i++) {
					int num = number.charAt(i) - '0';
					if(!digit[num]) digit[num] = true;
				}

				boolean flag = true;
				for(int i=0;i<10;i++) {
					if(!digit[i]) {
						flag = false;
						break;
					}
				}

				if(flag) break;
			}

			sb.append("#" + tc + " " + (k * N) + "\n");
		}

		System.out.print(sb.toString());
	}
}