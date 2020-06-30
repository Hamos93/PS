import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_6692_다솔이의월급상자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			
			double result = 0;
			for(int n=0;n<N;n++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				double p = Double.parseDouble(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
			
				result += p * x;
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
}