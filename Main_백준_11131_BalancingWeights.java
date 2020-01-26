import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11131_BalancingWeights {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			
			int result = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			while(N-- > 0) result += Integer.parseInt(st.nextToken());
			
			if(0 < result) System.out.println("Right");
			else if(result < 0) System.out.println("Left");
			else System.out.println("Equilibrium");
		}
	}
}