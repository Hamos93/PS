
public class Solution_L1_정수제곱근판별 {
    public static long solution(long n) {
        long x = (long)(Math.sqrt((double)n));

        if(x * x ==  n) return (x + 1) * (x + 1);
        else return -1;
    }
    
	public static void main(String[] args) {
		System.out.print(solution(50000000000000L));
	}
}
