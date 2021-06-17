import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_7985_RootedBinaryTree재구성 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int K = Integer.parseInt(st.nextToken());
			List<int[]> list = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				int node = Integer.parseInt(st.nextToken());
				list.add(new int[] { node, 0 });
			}
	
			int len = list.size(), level = K, cnt = 1;
			for(int i=K;1<=i;i--) {
				int idx = -1;
				for(int j=0;j<len;j++) {
					if(list.get(j)[1] == 0) {
						idx = j;
						break;
					}
				}
				
				int diff = (int) Math.pow(2, cnt);
				for(int j=idx;j<len;j+=diff) {
					int[] get = list.get(j);
					int node = get[0];
					
					list.set(j, new int[] { node, level });
				}
				
				level--; cnt++;
			}
			
			sb.append("#" + tc + " ");
			for(int i=1;i<=K;i++) {
				for(int j=0;j<len;j++) {
					if(list.get(j)[1] == i) 
						sb.append(list.get(j)[0] + " ");
				}
				
				sb.deleteCharAt(sb.length() - 1).append("\n");
			}
		}

		System.out.print(sb.toString().trim());
	}
}