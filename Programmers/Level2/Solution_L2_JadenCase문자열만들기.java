
public class Solution_L2_JadenCase문자열만들기 {
	public static String solution(String s) {
		String answer = "";

		char[] arr = s.toLowerCase().toCharArray();
		
		if(97 <= arr[0] && arr[0] <= 122)
			arr[0] = (char)(arr[0] - 32);

		answer += arr[0];
		
		boolean flag = false;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] == ' ') {
				flag = true;
				answer += arr[i];
				
				continue;
			}
			
			if(flag) {
				arr[i] = (char)(arr[i] - 32);
				flag = false;
			}
			
			answer += arr[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(" asdf"));
		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week"));
	}
}