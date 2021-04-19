import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution_L2_괄호회전하기 {
	public static int solution(String s) {
        int len = s.length();
        
        int answer = 0;
        for(int i=0;i<len;i++) {
        	Queue<Character> queue = new LinkedList<>();
        	for(int j=0;j<len;j++)
        		queue.offer(s.charAt(j));
        	
        	for(int k=0;k<i;k++)
        		queue.offer(queue.poll());
        	
        	Stack<Character> stack = new Stack<>();
        	boolean flag = true;
        	
        	while(!queue.isEmpty()) {
        		char ch = queue.poll();
        		if(ch == '(' || ch == '{' || ch == '[') stack.push(ch);
        		else {
        			if(stack.isEmpty() || (ch == ')' && stack.peek() != '(') || (ch == '}' && stack.peek() != '{') || (ch == ']' && stack.peek() != '[')) { 
        				flag = false;
        				break;
        			}else stack.pop();
        		}
        	}
        	
        	if(!stack.isEmpty()) 
        		flag = false;
        	
        	if(flag) answer++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("[](){}"));
		System.out.println(solution("}]()[{"));
		System.out.println(solution("[)(]"));
		System.out.println(solution("}}}"));
	}
}