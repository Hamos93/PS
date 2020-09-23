
public class Solution_L1_가운데글자가져오기 {
	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();

		if(s.length() % 2 == 1){
			sb.append(s.charAt(s.length() / 2));

			return sb.toString();
		}else{
			sb.append(s.charAt(s.length() / 2 - 1));
			sb.append(s.charAt(s.length() / 2));

			return sb.toString();
		}

	}

	public static void main(String[] args) {
		System.out.print(solution("abcde"));
	}
}