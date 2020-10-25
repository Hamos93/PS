
public class Solution_L2_124나라의숫자 {
    public static String solution(int n) {
    	String[] remainder = { "4", "1", "2" };
    	String answer = "";

    	while (0 < n) {
    		answer = remainder[n % 3] + answer;
    		n = (n - 1) / 3;
    	}

    	return answer;
    }
    
	public static void main(String[] args) {
		System.out.print(solution(9));
	}
}