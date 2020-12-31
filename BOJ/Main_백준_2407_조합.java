import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_백준_2407_조합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String input1 = st.nextToken();
		String input2 = st.nextToken();
		
		int N = Integer.parseInt(input1);
		int M = Integer.parseInt(input2);
		
		BigInteger n = new BigInteger(input1);
		BigInteger m = new BigInteger(input2);
		BigInteger z = n.subtract(m);
		
		for(int i=1;i<N;i++)
			n = n.multiply(new BigInteger(Integer.toString(i)));
		
		for(int i=1;i<M;i++)
			m = m.multiply(new BigInteger(Integer.toString(i)));
			
		for(int i=1;i<N - M;i++)
			z = z.multiply(new BigInteger(Integer.toString(i)));
		
		System.out.print(n.divide(m.multiply(z)));
	}
}