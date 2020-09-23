import java.util.Arrays;

public class Solution_L1_문자열내림차순으로배치하기 {
	public static String solution(String s) {
		char[] ch = s.toCharArray();

		Arrays.sort(ch);

		StringBuilder sb = new StringBuilder();
		for(int i=ch.length-1;0<=i;i--)
			sb.append(ch[i]);
		
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.print(solution("Zbcdefg"));
	}
}