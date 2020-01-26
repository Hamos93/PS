import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_백준_2935_소음 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine(), " ");
		BigInteger num1 = new BigInteger(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		char operator = st.nextToken().charAt(0);
		
		st = new StringTokenizer(br.readLine(), " ");
		BigInteger num2 = new BigInteger(st.nextToken());
	
		if(operator == '+') System.out.print(num1.add(num2));
		else System.out.print(num1.multiply(num2));
	}
}