
public class Solution_L2_숫자의표현 {
	private static int cnt;
	
	public static void solve(int idx, int sum, int n) {
		if(n <= sum) {
			if(sum == n) cnt++;
			
			return;
		}
		
		solve(idx + 1, sum + idx + 1, n);
	}
	
	public static int solution(int n) {
		cnt = 0;
		for(int i=1;i<=n;i++)
			solve(i, i, n);

		return cnt;
	}

	public static void main(String[] args) {
		System.out.print(solution(15));
	}
}