
public class Solution_L2_N개의최소공배수 {
	public static int solution(int[] arr) {
		int lcm = 0;
		for(int i=0;i<arr.length;i++)
			lcm = lcm < arr[i] ? arr[i] : lcm;

		int answer = 0;
		while(true) {
			boolean flag = true;

			for(int i=0;i<arr.length;i++) {
				if(lcm % arr[i] != 0) {
					flag = false;
					break;
				}
			}

			if(flag) {
				answer = lcm;
				break;
			}

			lcm++;
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 2, 6, 8, 14 }));
		System.out.println(solution(new int[] { 1, 2, 3 }));
	}
}