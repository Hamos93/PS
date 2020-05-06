import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1926_간단한369게임 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		loop: for(int i=1;i<=N;i++) {
			boolean flag = false;
			String value = Integer.toString(i);
			
			if(value.contains("3") || value.contains("6") || value.contains("9")) flag = true;
			
			if(flag) {
			for(int j=0;j<value.length();j++)
				if(value.charAt(j) - '0' == 3 || value.charAt(j) - '0' == 6 || value.charAt(j) - '0' == 9) sb.append("-");
		
				sb.append(" ");
				
				continue loop;
			}
			
			sb.append(i + " ");
		}
		
		System.out.print(sb.toString());
	}
}