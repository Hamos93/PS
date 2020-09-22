
public class Solution_L1_하샤드수 {
	public static boolean solution(int x) {
		String num = Integer.toString(x);
		int result = 0;

		for(int i=0;i<num.length();i++)
			result += num.charAt(i) - '0';

		if(x % result == 0) return true;
		else return false;
	}

	public static void main(String[] args) {
		if(solution(10)) System.out.println("Harshad number");
		else System.out.println("Not Harshad number");
	}
}
