import java.util.Arrays;

public class Solution_L1_예산 {
	public static int solution(int[] d, int budget) {
		Arrays.sort(d);

		int cnt = 0, len = d.length;
		for(int i=0;i<len;i++) {
			if(0 <= budget - d[i]) {
				budget -= d[i];
				cnt++;
			}else break;
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 3, 2, 5, 4 }, 9));
	}
}