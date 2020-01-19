import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10797_10부제 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int day = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<5;i++){
			int carNumber = Integer.parseInt(st.nextToken());
			
			if(carNumber == day) answer++;
		}
		
		System.out.print(answer);
	}
}