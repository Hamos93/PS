import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2475_검증수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken());
			sum += value * value;
		}
		
		System.out.print(sum % 10);
	}
}