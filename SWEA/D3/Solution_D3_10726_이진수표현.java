import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_10726_이진수표현 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			String binary = Integer.toBinaryString(M);
			while(binary.length() < N)
				binary += "0";

			int len = binary.length();
			boolean flag = true;

			for(int i=len-1;len-N<=i;i--) {
				if(binary.charAt(i) - '0' != 1) {
					flag = false;
					break;
				}
			}
			
			if(flag) sb.append("#" + tc + " ON\n");
			else sb.append("#" + tc + " OFF\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}