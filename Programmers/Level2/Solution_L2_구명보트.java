import java.util.Arrays;

public class Solution_L2_구명보트 {
	public static int solution(int[] people, int limit) {
		Arrays.sort(people);
		
		int left = 0, right = people.length - 1;
		
		int boat = 0;
		while(left <= right) {
			if(left == right) {
				boat++;
				break;
			}
			
			if(people[left] + people[right] <= limit) {
				left++;
				right--;
			}else right--;
			
			boat++;
		}
		
		return boat;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 70, 50, 80, 50 }, 100));
		System.out.println(solution(new int[] { 70, 80, 50 }, 100));
		System.out.println(solution(new int[] { 10, 20, 30, 70, 80, 90 }, 100));
		System.out.println(solution(new int[] { 40, 40, 80 }, 160));
	}
}