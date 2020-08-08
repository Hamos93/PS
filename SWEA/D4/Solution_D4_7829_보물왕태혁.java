import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D4_7829_보물왕태혁 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int P = Integer.parseInt(st.nextToken());
			int[] divisor = new int[P];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<P;i++)
				divisor[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(divisor);
			
			if(P == 1) System.out.println("#" + tc + " " + divisor[0] * divisor[0]);
			else System.out.println("#" + tc + " " + divisor[0] * divisor[P-1]);
		}
	}
}