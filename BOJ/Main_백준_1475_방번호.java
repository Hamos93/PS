import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1475_방번호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String N = st.nextToken();
		int len = N.length();
		
		int[] digit = new int[10];
		for(int i=0;i<len;i++) {
			int idx = N.charAt(i) - '0';
			
			if(idx == 6 || idx == 9) {
				if(digit[6] <= digit[9]) digit[6]++;
				else digit[9]++;
			}else digit[idx]++;
		}
		
		int cnt = 0;
		for(int i=0;i<=9;i++)
			if(cnt <= digit[i]) cnt = digit[i];

		System.out.print(cnt);
	}
}