
public class Solution_L1_내적 {
	public static int solution(int[] a, int[] b) {
		int result = 0, len = a.length;
		for(int i=0;i<len;i++)
			result += a[i] * b[i];
		
		return result;
	}

	public static void main(String[] args) {
		System.out.print(solution(new int[] { 1, 2, 3, 4 }, new int[] { -3, -1, 0, 2 }));
	}
}