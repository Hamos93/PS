import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;;

public class Main_백준_2908_상수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String str1 = st.nextToken();
		StringBuilder sb = new StringBuilder(str1);

		str1 = sb.reverse().toString();
		
		String str2 = st.nextToken();
		sb = new StringBuilder(str2);
		
		str2 = sb.reverse().toString();
		
		if(Integer.parseInt(str1) < Integer.parseInt(str2)) System.out.print(str2);
		else System.out.print(str1);
	}
}