import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5988_홀수일까짝수일까 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		while(N-- > 0){
			String num = br.readLine();

			int value = num.charAt(num.length() - 1) - '0';
			if(value % 2 == 0) System.out.println("even");
			else System.out.println("odd");
		}
	}
}