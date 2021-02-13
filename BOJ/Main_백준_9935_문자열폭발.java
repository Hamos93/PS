import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_백준_9935_문자열폭발 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().trim().toCharArray();
		String explosion = br.readLine().trim();
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			char ch = arr[i];
			stack.push(ch);
			
			// 폭발문자열 있는지 확인
			if(explosion.length() <= stack.size()) {
				boolean flag = true;
				
				for(int j=0;j<explosion.length();j++) {
					if(stack.get(stack.size() - explosion.length() + j) != explosion.charAt(j)) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					for(int j=0;j<explosion.length();j++)
						stack.pop();
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) 
			sb.append(stack.pop());
		
		if(sb.length() == 0) System.out.print("FRULA");
		else System.out.print(sb.reverse().toString());
	}
}