import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_14490_백대열 {
	private static int GCD(int a, int b) {
		while(true) {
			int r = a % b;
			
			if(r == 0) return b;
			
			a = b;
			b = r;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(":");
		
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
	
		int gcd = GCD(a, b);
		
		System.out.print((a /gcd) + ":" + (b/gcd));
	}
}