import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_12605_단어순서뒤집기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			Stack<String> stack = new Stack<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) stack.push(st.nextToken());
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("Case #" + tc + ": ");
			while(!stack.isEmpty()) sb.append(stack.pop() + " ");
			
			System.out.println(sb.toString().trim());
		}
	}
}