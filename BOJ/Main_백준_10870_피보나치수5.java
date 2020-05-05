import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10870_피보나치수5 {
	private static int fibo(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		
		System.out.print(fibo(n));
	}
}