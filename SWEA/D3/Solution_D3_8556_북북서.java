import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_8556_북북서 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String line = br.readLine().trim();
			
			int idx = line.length();
			double dir = 0; int n = 0;
			while(true) {
				if(line.charAt(idx - 1) == 'h') {
					idx -= 5;
					
					if(n == 0) dir = 0;
					else dir -= 90 / Math.pow(2, n);
				}else {
					idx -= 4;
					
					if(n == 0) dir = 90;
					else dir += 90 / Math.pow(2, n);
				}
				
				n++;
				
				if(idx <= 0) break;
			}
			
			if(dir == (int)dir) System.out.println("#" + tc + " " + (int)dir);
			else{
				int num = 2;
				
				while(true) {
					if(dir * num == (int)(dir * num)) {
						int numerator = (int)((dir * num));
						int denominator = num;
						
						System.out.println("#" + tc + " " + numerator + "/" + denominator);
						break;
					}
					
					num++;
				}
			}
		}
	}
}