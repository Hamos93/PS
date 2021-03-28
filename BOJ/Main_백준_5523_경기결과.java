import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5523_경기결과 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int A = 0, B = 0;
		
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
		
			if(num1 < num2) B++;
			if(num2 < num1) A++;
		}

		System.out.print(A + " " + B);
	}
}