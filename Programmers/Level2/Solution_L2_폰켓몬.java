import java.util.HashSet;
import java.util.Set;

public class Solution_L2_폰켓몬 {
	public static int solution(int[] nums) {
		int answer = nums.length / 2;
		
		Set<Integer> hashSet = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(!hashSet.contains(nums[i]))
				hashSet.add(nums[i]);
		}
		
		return hashSet.size() < answer ? hashSet.size() : answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 1, 2, 3 }));
		System.out.println(solution(new int[] { 3, 3, 3, 2, 2, 4 }));
		System.out.println(solution(new int[] { 3, 3, 3, 2, 2, 2 }));
	}
}