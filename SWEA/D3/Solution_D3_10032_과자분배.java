import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_10032_과자분배 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
		
			int[] snack = new int[K];
			
			int idx = 0;
			while(0 < N--) {
				snack[idx]++;
				
				idx++;
				
				if(idx == K) idx = 0;
			}
			
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for(int i=0;i<K;i++) {
				max = max < snack[i] ? snack[i] : max;
				min = snack[i] < min ? snack[i] : min; 
			}
			
			System.out.println("#" + tc + " " + (max - min));
		}
	}
}