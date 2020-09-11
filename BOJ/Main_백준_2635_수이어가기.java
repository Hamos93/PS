import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2635_수이어가기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int first = Integer.parseInt(st.nextToken());
		int second = 0, result = 0;

		for(int i=first;1<=i;i--) {
			int num1 = first, num2 = i, num3 = num1 - num2;
			int cnt = 3;

			while(true) {
				num1 = num2;
				num2 = num3;

				num3 = num1 - num2;

				if(num3 < 0) break;

				cnt++;
			}

			if(result < cnt) {
				result = cnt;
				second = i;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(result + "\n" + first + " " + second + " ");
		while(true) {
			int next = first - second;

			if(next < 0) break;

			sb.append(next + " ");
			first = second;
			second = next;
		}

		System.out.print(sb.toString().trim());
	}
}