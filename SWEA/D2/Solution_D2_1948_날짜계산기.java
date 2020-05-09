import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1948_날짜계산기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		st = new StringTokenizer(br.readLine(), " "); 
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int[] date = new int[4];
			for(int i=0;i<4;i++)
				date[i] = Integer.parseInt(st.nextToken());
			
			int diff = 0;
			if(date[0] == date[2]) diff = date[3] - date[1] + 1;
			else {
				diff += month[date[0]] - date[1] + 1;
				
				for(int i=date[0] + 1; i < date[2]; i++)
					diff += month[i];
				
				diff += date[3];
			}
			
			sb.append("#" + tc + " " + diff + "\n");
		}
		
		System.out.print(sb.toString());
	}
}