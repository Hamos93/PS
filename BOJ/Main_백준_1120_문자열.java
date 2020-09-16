import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1120_문자열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		int len1 = A.length();
		int len2 = B.length();

		int diff = 0;
		if(len1 == len2) {
			for(int i=0;i<len1;i++)
				if(A.charAt(i) != B.charAt(i)) diff++;
		
			System.out.print(diff);
			return;
		}
		
		diff = Integer.MAX_VALUE;
		for(int i=0;i<=len2-len1;i++) {
			int cnt = 0;
			for(int j=0;j<len1;j++)
				if(A.charAt(j) != B.charAt(i+j)) cnt++;
	
			diff = cnt < diff ? cnt : diff;
		}
		
		System.out.print(diff);
	}
}