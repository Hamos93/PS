import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1222_계산기1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int len = Integer.parseInt(st.nextToken());

			String line = br.readLine().trim();
			int sum = 0;

			for(int i=0;i<len;i++)
				if(line.charAt(i) != '+') sum += line.charAt(i) - '0';
			
			System.out.println("#" + tc + " " + sum);
		}
	}
}