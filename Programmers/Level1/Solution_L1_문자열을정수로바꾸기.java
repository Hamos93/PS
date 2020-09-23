
public class Solution_L1_문자열을정수로바꾸기 {
	public static int solution(String s) {
		if(s.charAt(0) == '+') return Integer.parseInt(s.substring(1));                          
		if(s.charAt(0) == '-') return -1 * Integer.parseInt(s.substring(1));

		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		System.out.print("-1234");
	}
}