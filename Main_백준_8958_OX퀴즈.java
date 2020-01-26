import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_8958_OX퀴즈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			String question = br.readLine();
			
			int answer = 0, score = 1;
			for(int i=0;i<question.length();i++){
				if(question.charAt(i) == 'O') answer += score;
				else score = 0;
				
				score++;
			}
			
			System.out.println(answer);
		}
	}
}