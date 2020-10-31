
public class Solution_L1_3진법뒤집기 {
	public static int solution(int n) {
		String value = "";
		while(n != 0) {
			value += n % 3;
			n /= 3;
		}

		int len = value.length(), answer = 0;
		for(int i=len - 1;0<=i;i--)
			answer += (value.charAt(i) - '0') * (int)(Math.pow(3, len - i - 1));

		return answer;
	}

	public static void main(String[] args) {
		System.out.print(solution(100000000));
	}
}