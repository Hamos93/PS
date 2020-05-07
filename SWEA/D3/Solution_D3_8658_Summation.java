import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_8658_Summation {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
			while(st.hasMoreTokens()) {
				String word = st.nextToken();
				
				int value = 0;
				for(int i=0;i<word.length();i++)
					value += word.charAt(i) - '0';

				maxValue = maxValue < value ? value : maxValue;
				minValue = value < minValue ? value : minValue;
			}
			
			System.out.println("#" + tc + " " + maxValue + " " + minValue);
		}
	}
}