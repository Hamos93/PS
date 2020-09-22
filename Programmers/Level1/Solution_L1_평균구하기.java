
public class Solution_L1_평균구하기 {
	public static double solution(int[] arr) {
		double sum = 0;

		for(int i=0;i<arr.length;i++)
			sum += arr[i];

		return sum / arr.length;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.print(solution(arr));
	}
}