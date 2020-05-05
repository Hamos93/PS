import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_2058_자릿수더하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String N = st.nextToken().trim();
		
		int answer = 0;
		for(int i=0;i<N.length();i++) 
			answer += N.charAt(i) - '0';
		
		System.out.println(answer);
	}
}