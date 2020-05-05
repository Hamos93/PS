import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10039_평균점수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int sum = 0;
		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int score = Integer.parseInt(st.nextToken());
			
			if(score < 40) score = 40;
			
			sum += score;
		}
		
		System.out.print(sum / 5);
	}
}