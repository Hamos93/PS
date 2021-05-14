
public class Solution_L1_약수의개수와덧셈 {
	public static int solution(int left, int right) {
		int answer = 0;
		for(int i=left;i<=right;i++) {
			if(check(i)) answer += i;
			else answer -= i;
		}
		
		return answer;
	}
	
	public static boolean check(int num) {
		int cnt = 0;
		for(int i=1;i<=num;i++) {
			if(num % i == 0) cnt++;
		}
		
		return cnt % 2 == 0 ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(13, 17));
		System.out.println(solution(24, 27));
	}
}