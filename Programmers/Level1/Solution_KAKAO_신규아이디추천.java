
public class Solution_KAKAO_신규아이디추천 {
	public static String solution(String new_id) {
		new_id = new_id.toLowerCase();

		String id = "";
		for(int i=0;i<new_id.length();i++) {
			char ch = new_id.charAt(i);
			if(('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9') || ch == '-' || ch == '_' || ch == '.') {
				if(ch == '.' && (0 <= id.length() - 1 && id.charAt(id.length() - 1) == '.')) continue; 

				id += ch;
			}
		}

		if(!id.equals("") && id.charAt(0) == '.') id = id.substring(1);
		if(0 <= id.length() - 1) {
			int idx = 0;
			for(int i=id.length()-1;0<=i;i--) {
				char ch = id.charAt(i);

				if(ch != '.') {
					idx = i;
					break;
				}
			}

			id = id.substring(0, idx + 1);
		}

		if(id.equals("")) id += "a";

		StringBuilder sb = new StringBuilder();

		if(16 <= id.length()) {
			id = id.substring(0, 15);

			int idx = 0;
			for(int i=id.length()-1;0<=i;i--) {
				char ch = id.charAt(i);

				if(ch != '.') {
					idx = i;
					break;
				}
			}

			id = id.substring(0, idx + 1);
		}

		if(id.length() <= 2) {
			char ch = id.charAt(id.length() - 1);
			while(id.length() != 3) id += ch;
		}

		return id;
	}

	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^.")); System.out.println(solution("=.="));
		System.out.println(solution("123_.def"));
		System.out.println(solution("abcdefghijklmn.p"));
	}
}