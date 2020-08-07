import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_4698_테네스의특별한소수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		boolean[] prime = new boolean[1000001];
		prime[0] = true; prime[1] = true;
		
		for(int i=2;i<=1000000;i++) {
			if(!prime[i]) {
				for(int j=i+i;j<=1000000;j+=i) {
					if(!prime[j]) prime[j] = true;
				}
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			char D = st.nextToken().charAt(0);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			int cnt = 0;
			for(int i=A;i<=B;i++) {
				if(!prime[i]) {
					String num = Integer.toString(i);
					
					for(int j=0;j<num.length();j++) {
						if(num.charAt(j) == D) {
							cnt++;
							break;
						}
					}
				}
			}
			
			sb.append("#" + tc + " " + cnt + "\n");
		}
		
		System.out.print(sb.toString());
	}
}