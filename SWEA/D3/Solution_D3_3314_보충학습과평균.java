import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3314_보충학습과평균 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int[] student = new int[5];
			int sum = 0;
			for(int i=0;i<5;i++) {
				student[i] = Integer.parseInt(st.nextToken());
				
				if(student[i] < 40) student[i] = 40;
			
				sum += student[i];
			}
			
			System.out.println("#" + tc + " " + (sum / 5));
		}
	}
}