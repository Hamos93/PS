import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_1545_거꾸로출력해보아요 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		for(int i=n;0<=i;i--)
			sb.append(i + " ");
		
		System.out.print(sb.toString().trim());
	}
}