
public class Solution_L1_자릿수더하기 {
    public static int solution(int n) {
        String str = Integer.toString(n);
        
        int answer = 0;
        for(int i=0;i<str.length();i++)
            answer += str.charAt(i) - '0';

        return answer;
    }
	
	public static void main(String[] args) {
		System.out.print(solution(123));
	}
}
