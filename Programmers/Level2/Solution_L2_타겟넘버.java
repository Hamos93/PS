
public class Solution_L2_타겟넘버 {
	private static int cnt = 0;
	
	public static void dfs(int[] numbers, int idx, int sum, int target) {
		if(idx == numbers.length) {
			if(sum == target) 
				cnt++;
	
			return;
		}
		
		dfs(numbers, idx + 1, sum + numbers[idx], target);
		dfs(numbers, idx + 1, sum - numbers[idx], target);
	}
	
	public static int solution(int[] numbers, int target) {
		dfs(numbers, 0, 0, target);
		
		return cnt;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 1, 1, 1, 1 }, 3));
	}
}