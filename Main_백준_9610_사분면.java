import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_9610_사분면 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		
		int Q1 = 0, Q2 = 0, Q3 = 0, Q4 = 0, AXIS = 0;
		while(n-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
	
			if(x == 0 || y == 0) AXIS++;
			else if(0 < x && 0 < y) Q1++;
			else if(x < 0 && 0 < y) Q2++;
			else if(x < 0 && y < 0) Q3++;
			else if(0 < x && y < 0) Q4++;
		}
		
		System.out.print("Q1: " + Q1 + "\n" + "Q2: " + Q2 + "\n" + "Q3: " + Q3 + "\n" + "Q4: " + Q4 + "\n" + "AXIS: " + AXIS);
	}
}