import java.util.Arrays;

public class Solution_L2_이진변환반복하기 {
	public static int[] solution(String s) {
		int cnt = 0, zero = 0;
		
		while(!s.equals("1")) {
			int one = 0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) - '0' == 0) zero++;
				else one++;
			}
			
			s = Integer.toBinaryString(one);
			
			cnt++;
		}
		
		return new int[] { cnt, zero };
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("110010101001")));
	}
}