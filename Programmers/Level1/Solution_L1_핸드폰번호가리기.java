
public class Solution_L1_핸드폰번호가리기 {
    public static String solution(String phone_number) {
        String answer = "";
        
        for(int i=0;i<phone_number.length()-4;i++)
             answer += "*";
    
        answer += phone_number.substring(phone_number.length() - 4);
        
        return answer;
    }
    
	public static void main(String[] args) {
		System.out.print(solution("01033334444"));
		// System.out.print(solution("027778888"));
	}
}