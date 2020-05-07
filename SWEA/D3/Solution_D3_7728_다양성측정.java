import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7728_다양성측정 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			String X = st.nextToken();
			
			int[] digit = new int[10];
			for(int i=0;i<X.length();i++)
				digit[X.charAt(i) - '0']++;
			
			int cnt = 0;
			for(int i=0;i<10;i++)
				if(digit[i] != 0) cnt++;
			
			System.out.println("#" + tc + " " + cnt);
		}
	}
}