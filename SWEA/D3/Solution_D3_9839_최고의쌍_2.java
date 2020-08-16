import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_9839_최고의쌍_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			int[] num = new int[N];

			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				num[i] = Integer.parseInt(st.nextToken());

			Arrays.sort(num);

			int pair = -1;
			loop: for(int i=N-1;0<=i;i--) {
				for(int j=i-1;0<=j;j--) {
					int result = num[i] * num[j];

					int temp = result; // 345
					int digit = temp % 10; // 5
					temp /= 10; // 34

					boolean flag = true;
					while(0 < temp) {
						if(digit - 1 == temp % 10) digit--; // 4
						else {
							flag = false;
							break;
						}

						temp /= 10; // 3
					}

					if(flag) {
						pair = result;
						break loop;
					}
				}
			}

			sb.append("#" + tc + " " + pair + "\n");
		}

		System.out.print(sb.toString());
	}
}