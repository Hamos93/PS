import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_백준_10799_쇠막대기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine().trim();

		Stack<Character> stack = new Stack<>();
		int answer = 0, idx = 0;
		
		for(int i=0;i<line.length();i++) {
			char bracket = line.charAt(i);
			
			if(bracket == '(') {
				stack.push(bracket);
				idx = i;
			}else {
				if(i - idx == 1) {
					// 레이져 구간
					stack.pop();

					answer += stack.size();
				}else {
					// 괄호 끝 구간
					stack.pop();

					answer++;
				}
			}
		}
		
		System.out.print(answer);
	}
}