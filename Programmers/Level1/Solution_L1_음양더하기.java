
public class Solution_L1_음양더하기 {
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i=0;i<absolutes.length;i++) {
			if(!signs[i]) absolutes[i] *= -1;
			
			answer += absolutes[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 4, 7, 12 }, new boolean[] { true, false, true }));
	}
}