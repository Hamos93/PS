import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1221_GNS {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			String t = st.nextToken();
			int len = Integer.parseInt(st.nextToken());

			int[] number = new int[10];

			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				String value = st.nextToken();

				switch (value) {
				case "ZRO":
					number[0]++;
					break;
				case "ONE":
					number[1]++;
					break;
				case "TWO":
					number[2]++;
					break;
				case "THR":
					number[3]++;
					break;
				case "FOR":
					number[4]++;
					break;
				case "FIV":
					number[5]++;
					break;
				case "SIX":
					number[6]++;
					break;
				case "SVN":
					number[7]++;
					break;
				case "EGT":
					number[8]++;
					break;
				case "NIN":
					number[9]++;
					break;
				}
			}

			StringBuilder sb = new StringBuilder();
			sb.append(t + "\n");
			for(int i=0;i<=9;i++) {
				String value = "";

				switch (i) {
				case 0:
					value = "ZRO";
					break;
				case 1:
					value = "ONE";
					break;
				case 2:
					value = "TWO";
					break;
				case 3:
					value = "THR";
					break;
				case 4:
					value = "FOR";
					break;
				case 5:
					value = "FIV";
					break;
				case 6:
					value = "SIX";
					break;
				case 7:
					value = "SVN";
					break;
				case 8:
					value = "EGT";
					break;
				case 9:
					value = "NIN";
					break;
				}

				while(0 < number[i]) {
					sb.append(value + " ");
					number[i]--;
				}
			}
			System.out.println(sb.toString().trim());
		}
	}
}