import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1976_시각덧셈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int[] time = new int[4];
			for(int i=0;i<4;i++)
				time[i] = Integer.parseInt(st.nextToken());
			
			int minute = time[1] + time[3];
			
			int hour = (60 <= minute) ? 1 : 0;
			if(hour == 1) minute %= 60;
			
			hour += time[0] + time[2];
			if(12 < hour) hour %= 12;
			if(hour == 0) hour = 12;
			
			sb.append("#" + tc + " " + hour + " " + minute + "\n");
		}
		
		System.out.print(sb.toString());
	}
}