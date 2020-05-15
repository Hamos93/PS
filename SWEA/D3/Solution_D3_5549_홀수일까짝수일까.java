import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5549_홀수일까짝수일까 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String number = br.readLine().trim();
			
			int last = number.charAt(number.length() - 1) - '0';
			
			String answer = (last % 2 == 0) ? "Even" : "Odd";
			System.out.println("#" + tc + " " + answer);
		}
	}
}