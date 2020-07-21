import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_9229_한빈이와SpotMart {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
		
			int[] snack = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				snack[i] = Integer.parseInt(st.nextToken());
			
			int max = -1;
			loop: for(int i=0;i<N;i++) {
				for(int j=i+1;j<N;j++) {
					int weight = snack[i] + snack[j];
					
					if(max < weight && weight <= M) {
						max = weight;
						
						if(max == M) break loop;
					}
				}
			}
			
			sb.append("#" + tc + " " + max + "\n");
		}
		
		System.out.print(sb.toString());
	}
}