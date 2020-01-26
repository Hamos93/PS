import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10833_사과 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int answer = 0;

		while(N-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int student = Integer.parseInt(st.nextToken());
			int apple = Integer.parseInt(st.nextToken());
			
			answer += (apple % student);
		}
		
		System.out.print(answer);
	}
}