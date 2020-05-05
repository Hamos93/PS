import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_2043_서랍의비밀번호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int P = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.print(Math.abs(P - K) + 1);
	}
}