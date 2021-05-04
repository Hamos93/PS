
public class Solution_L3_거스름돈 {
    public static int solution(int n, int[] money) {
    	long[] change = new long[100001];
    	change[0] = 1;
    	
    	for(int i=0;i<money.length;i++) {
    		for(int j=money[i];j<=n;j++) {
    			change[j] = (change[j] + change[j - money[i]]) % 1000000007;
    		}
    	}
    	
        return (int) change[n];
    }
    
    public static void main(String[] args) {
    	System.out.print(solution(5, new int[] { 1, 2, 5 }));
	}
}