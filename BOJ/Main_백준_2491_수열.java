import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2491_수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		st.nextToken();
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int preNum = -1, asc = 0, desc = 0, len = 0; 
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if(preNum < num) {
				asc++;
				desc = 1;
			}
			
			if(num < preNum) {
				asc = 1;
				desc++;
			}
			
			if(preNum == num) {
				asc++;
				desc++;
			}
			
			preNum = num;
			
			if(len < asc) len = asc;
			if(len < desc) len = desc;
		}
		
		System.out.print(len);
	}
}