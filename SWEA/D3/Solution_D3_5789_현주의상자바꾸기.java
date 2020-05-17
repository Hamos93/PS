import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5789_현주의상자바꾸기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int[] box = new int[N + 1];
			
			for(int i=1;i<=Q;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int L = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken());
				
				for(int j=L;j<=R;j++)
					box[j] = i;
			}
			
			System.out.print("#" + tc + " ");
			for(int i=1;i<N+1;i++)
				System.out.print(box[i] + " ");
			System.out.println();
		}
	}
}