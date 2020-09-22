
public class Solution_L1_짝수와홀수 {
    public static String solution(int num) {
        if(num % 2 == 0) return "Even";
        else return "Odd";
    }
    
	public static void main(String[] args) {
		System.out.print(solution(3));
	}
}