import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2702_초6수학 {
	private static int GCD(int a, int b){
		while(true){
			int r = a % b;
			
			if(r == 0) break;
			
			a = b;
			b = r;
		}
		
		return b;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int gcd = GCD(a, b);
			
			int lcm = a * b / gcd;
			
			System.out.println(lcm + " " + gcd);
		}
	}
}