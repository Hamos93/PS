import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7732_시간개념 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			// 현재 시각
			String str1 = br.readLine().trim();
			str1 = str1.replaceAll(":", "");

			int[] current = new int[3];
			for(int i=0;i<3;i++)
				current[i] = Integer.parseInt(str1.substring(i * 2, i * 2 + 2));

			int curTotal = current[0] * 3600 + current[1] * 60 + current[2];

			// 약속 시각
			String str2 = br.readLine().trim();
			str2 = str2.replaceAll(":", "");

			int[] promise = new int[3];
			for(int i=0;i<3;i++)
				promise[i] = Integer.parseInt(str2.substring(i * 2, i * 2 + 2));

			int proTotal = promise[0] * 3600 + promise[1] * 60 + promise[2];

			int[] result = new int[3];
			// 현재 시각 < 약속 시각
			if(curTotal <= proTotal) {
				for(int i=2;0<=i;i--) {
					if(promise[i] < current[i]) {
						if(promise[i-1] != 0) {
							promise[i] += 60;
							promise[i-1]--;
						}else {
							promise[i] += 60;
							promise[i-1] += 59;
							promise[i-2]--;
						}
					}

					result[i] += (promise[i] - current[i]);
					
					if(60 <= result[i]) {
						result[i] -= 60;
						result[i-1]++;
					}
				}
			}else {
				// 보정
				int[] correction = { 24, 0, 0 };
				for(int i=2;0<=i;i--) {
					if(correction[i] < current[i]) {
						if(correction[i-1] != 0) {
							correction[i] += 60;
							correction[i-1]--;
						}else {
							correction[i] += 60;
							correction[i-1] += 59;
							correction[i-2]--;
						}					}

					result[i] += (correction[i] - current[i] + promise[i]);
				
					if(60 <= result[i]) {
						result[i] -= 60;
						result[i-1]++;
					}
				}

			}

			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			for(int i=0;i<3;i++) {
				if(i < 2) {
					if(result[i] < 10) sb.append("0" + result[i] + ":");
					else sb.append(result[i] + ":");
				}
				
				if(i == 2) {
					if(result[i] < 10) sb.append("0" + result[i]);
					else sb.append(result[i]);
				}
			}
			
			System.out.println(sb.toString());
		}
	}
}