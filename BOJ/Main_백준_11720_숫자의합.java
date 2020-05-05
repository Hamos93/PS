import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_11720_숫자의합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String line = br.readLine();
		
		int answer = 0;
		for(int i=0;i<N;i++)
			answer += line.charAt(i) - '0';
		
		System.out.print(answer);
	}
}