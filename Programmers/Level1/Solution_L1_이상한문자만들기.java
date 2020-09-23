
public class Solution_L1_이상한문자만들기 {
	public static String solution(String s) {
		char[] ch = s.toUpperCase().toCharArray();

		int idx = 0;
		for(int i=0;i<ch.length;i++){
			if((65 <= ch[i] && ch[i] <= 91) && (idx % 2 == 0)) idx++;
			else if((65 <= ch[i] && ch[i] <= 91) && (idx % 2 == 1)) {
				ch[i] += 32;
				idx++;
			}
			else idx = 0;
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ch.length;i++)
			sb.append(ch[i]);

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.print(solution("  try hello world  "));
	}
}