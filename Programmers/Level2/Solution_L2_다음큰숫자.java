
public class Solution_L2_다음큰숫자 {
	public static int solution(int n) {
		int answer = 0;
		
		String binary1 = Integer.toBinaryString(n);
		int cnt1 = 0;
		
		for(int i=0;i<binary1.length();i++)
			if(binary1.charAt(i) == '1') cnt1++;
		
		int idx = n+1;
		while(true) {
			String binary2 = Integer.toBinaryString(idx);
			int cnt2 = 0;

			for(int i=0;i<binary2.length();i++)
				if(binary2.charAt(i) == '1') cnt2++;
			
			if(cnt1 == cnt2) {
				answer = idx;
				break;
			}
			
			idx++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(78));
		System.out.println(solution(15));
	}
}