import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_9997_미니멀리즘시계 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int angle = Integer.parseInt(st.nextToken());
			
			int hour = angle / 30;
			angle -= hour * 30;
			int minute = angle * 2;
			
			System.out.println("#" + tc + " " + hour + " " + minute);
		}
	}
}