import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_7567_그릇 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String dish = br.readLine().trim();
		int answer = 0;
		
		char preDish = dish.charAt(0);
		for(int i=0;i<dish.length();i++){
			if(i == 0) {
				answer += 10;
				continue;
			}

			char curDish = dish.charAt(i);
			if(preDish == curDish) answer += 5;
			else answer += 10;
			
			preDish = curDish;
		}
		
		System.out.print(answer);
	}
}