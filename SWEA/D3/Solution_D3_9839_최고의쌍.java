import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_9839_최고의쌍 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] num = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			int pair = -1;
			for(int i=0;i<N;i++) {
				for(int j=i+1;j<N;j++) {
					int result = num[i] * num[j];
					
					if(pair < result) {
						String str = Integer.toString(result);
						int len = str.length();
						
						boolean flag = true;
						for(int k=len-1;1<=k;k--) {
							if((str.charAt(k) - '0') - (str.charAt(k-1) - '0') != 1) {
								flag = false;
								break;
							}
						}
						
						if(flag) pair = result;
					}
				}
			}
			
			sb.append("#" + tc + " " + pair + "\n");
		}
		
		System.out.print(sb.toString());
	}
}