import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_2056_연월일달력 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			String tempDate = st.nextToken().trim();
			
			String[] date = new String[8];
			for(int i=0;i<8;i++) 
				date[i] = tempDate.substring(i, i+1);
			
			int month = Integer.parseInt(date[4] + date[5]);
		
			if(month < 1 || 12 < month) {
				sb.append("#" + tc + " " + "-1\n");
				continue;
			}
			
			int day = Integer.parseInt(date[6] + date[7]);
			boolean flag = false;
			
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(1 <= day && day <= 31) flag = true;
				else flag = false;
				
				break;
			case 2:
				if(1 <= day && day <= 28) flag = true;
				else flag = false;
				
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(1 <= day && day <=30) flag = true;
				else flag = false;
				
				break;
			}
			
			if(!flag) sb.append("#" + tc + " " + "-1\n");
			else {
				sb.append("#" + tc + " ");
				for(int i=0;i<8;i++) { 
					if(i == 4 || i == 6) sb.append("/");
					sb.append(date[i]);
				}
				
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
	}
}