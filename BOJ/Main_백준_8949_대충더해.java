import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_8949_대충더해 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		String A = st.nextToken();
		String B = st.nextToken();
		
		if(A.length() <= B.length()) {
			int diff = B.length() - A.length();
			while(0 < diff--) A = "0" + A;
		}else {
			int diff = A.length() - B.length();
			while(0 < diff--) B = "0" + B;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<A.length();i++)
			sb.append((A.charAt(i) - '0') + (B.charAt(i) - '0'));
		
		System.out.print(sb.toString());
	}
}