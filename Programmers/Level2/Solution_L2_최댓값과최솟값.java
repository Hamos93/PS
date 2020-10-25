
public class Solution_L2_최댓값과최솟값 {
	public static String solution(String s) {
		String[] array = s.split(" ");

		int max = Integer.parseInt(array[0]);
		int min = Integer.parseInt(array[0]);
		
		for(int i=0;i<array.length;i++) {
			int value = Integer.parseInt(array[i]);
			
			max = max < value ? value : max;
			min = value < min ? value : min;
		}
		
		String answer = min + " " + max;
		return answer;
	}

	public static void main(String[] args) {
		System.out.print(solution(solution("1 2 3 4")));
	}
}