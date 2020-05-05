import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_1938_아주간단한계산기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append((a+b) + "\n" + (a-b) + "\n" + (a*b) + "\n" + (a/b));
		System.out.print(sb.toString());
	}
}