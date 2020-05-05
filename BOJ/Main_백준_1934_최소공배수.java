import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1934_최소공배수 {
	private static int GCD(int a, int b){
		int r = 0;
		while(true){
			r = a % b;
			
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
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
	
			int result = GCD(A, B);
			System.out.println((A * B) / result);
		}
	}
}