import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_D3_8931_제로 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int K = Integer.parseInt(st.nextToken());

			Stack<Integer> stack = new Stack<>();
			while(K-- > 0) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int money = Integer.parseInt(st.nextToken());
				if(money == 0) {
					if(!stack.isEmpty()) stack.pop();
				}else stack.push(money);
			}
			
			int answer = 0;
			while(!stack.isEmpty()) answer += stack.pop(); 
		
			System.out.println("#" + tc + " " + answer);
		}
	}
}