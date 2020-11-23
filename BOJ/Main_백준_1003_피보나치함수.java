import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1003_피보나치함수 {
	public static void main(String[] args) throws Exception {
		int[] zero = new int[41];
		zero[0] = 1; zero[1] = 0;
		
		int[] one = new int[41];
		one[0] = 0; one[1] = 1;
		
		for(int i=2;i<=40;i++) {
			zero[i] = zero[i - 1] + zero[i - 2];
			one[i] = one[i - 1] + one[i - 2];
		}
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			System.out.println(zero[N] + " " + one[N]);
		}
	}
}