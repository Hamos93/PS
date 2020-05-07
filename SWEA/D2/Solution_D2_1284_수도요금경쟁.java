import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1284_수도요금경쟁 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int[] waterPrice = new int[5];
			for(int i=0;i<5;i++)
				waterPrice[i] = Integer.parseInt(st.nextToken());
			
			int A = waterPrice[0] * waterPrice[4];
			
			int B = 0;
			if(waterPrice[4] <= waterPrice[2]) B = waterPrice[1];
			else B = (waterPrice[4] - waterPrice[2]) * waterPrice[3] + waterPrice[1];
			
			int answer = A < B ? A : B;
			System.out.println("#" + tc + " " + answer);
		}
	}
}