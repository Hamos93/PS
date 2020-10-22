
public class Solution_KAKAO_문자열압축 {
	public static int solution(String s) {
		int len = s.length();
		int answer = len;

		for(int i=1;i<=len/2;i++) {
			StringBuilder sb = new StringBuilder();

			String pattern = s.substring(0, i);
			int pLen = pattern.length();
			int cnt = 1;
			
			for(int j=pLen;j<len;j+=pLen) {
				if(len < j + pLen) {
					sb.append(s.substring(j, len));
					break;
				}
				
				if(pattern.equals(s.substring(j, j + pLen))) cnt++;
				else {
					if(cnt <= 1) sb.append(pattern);
					else {
						sb.append(cnt);
						sb.append(pattern);
					}
					
					pattern = s.substring(j, j + pLen);
					cnt = 1;
				}
			}

			if(cnt <= 1) sb.append(pattern);
			else {
				sb.append(cnt);
				sb.append(pattern);
			}
			
			answer = sb.toString().length() < answer ? sb.toString().length() : answer;
		}

		return answer;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(solution("xababcdcdababcdcd"));
	}
}