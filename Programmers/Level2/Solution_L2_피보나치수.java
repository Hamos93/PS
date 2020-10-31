
public class Solution_L2_피보나치수 {
    public static int solution(int n) {
    	long[] fivo = new long[100001];
    	fivo[0] = 0; fivo[1] = 1;
    	
    	for(int i=2;i<=100000;i++) {
    		fivo[i] = fivo[i - 1] + fivo[i - 2];
    		fivo[i] %= 1234567;
    	}
    	
    	return (int)(fivo[n]);
    }
    
	public static void main(String[] args) {
		System.out.print(solution(10000));
	}
}