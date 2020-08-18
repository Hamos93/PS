import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_D4_5432_쇠막대기자르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String line = br.readLine().trim();

			Stack<Character> stack = new Stack<>();
			int cnt = 0;
			boolean laser = false;
			
			for(int i=0;i<line.length();i++) {
				char bracket = line.charAt(i);
				
				if(bracket == '(') {
					laser = true;
					stack.push(bracket);
				}else {
					stack.pop();
					
					if(laser) {
						laser = false;
						cnt += stack.size();
					}else cnt++;
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
		}
	}
}