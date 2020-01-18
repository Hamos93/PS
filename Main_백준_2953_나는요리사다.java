import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2953_나는요리사다 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] participant = new int[6];
		for(int i=1;i<=5;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			int score = 0;
			while(st.hasMoreTokens()) score += Integer.parseInt(st.nextToken());
			
			participant[i] = score;
		}
		
		int answerIdx = 0;
		int answer = 0;
		
		for(int i=1;i<=5;i++){
			if(answer < participant[i]) {
				answer = participant[i];
				answerIdx = i;
			}
		}
		
		System.out.print(answerIdx + " " + answer);
	}
}