import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3809_화섭이의정수나열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			
			StringBuilder sb = new StringBuilder();
			sb.setLength(0);
		
			while(sb.length() < N) sb.append(br.readLine().replace(" ", ""));
			
			String line = sb.toString();

			int answer = 0;
			while(true) {
				String num = Integer.toString(answer);

				if(line.contains(num)) answer++;
				else break;
			}

			System.out.println("#" + tc + " " + answer);
		}
	}
}