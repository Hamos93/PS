import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_10610_30 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int len = N.length();
		
		int[] digit = new int[10];
		int sum = 0; boolean flag = false;
		for(int i=0;i<len;i++) {
			int value = N.charAt(i) - '0';

			digit[value]++;
			sum += value;
			
			if(value == 0) flag = true;
		}
		
		if(sum % 3 != 0 || !flag) {
			System.out.print("-1");
			return;
		}

		StringBuilder sb = new StringBuilder();
		for(int i=9;0<=i;i--)
			while(0 < digit[i]--) sb.append(i);

		System.out.print(sb.toString());
	}
}