import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_18406_럭키스트레이트 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine().trim();
		
		int len = N.length();
		String left = N.substring(0, len/2);
		String right = N.substring(len/2, len);
		
		int sum1 = 0, sum2 = 0;
		for(int i=0;i<len/2;i++) {
			sum1 += left.charAt(i) - '0';
			sum2 += right.charAt(i) - '0';
		}
		
		if(sum1 == sum2) System.out.print("LUCKY");
		else System.out.print("READY");
	}
}