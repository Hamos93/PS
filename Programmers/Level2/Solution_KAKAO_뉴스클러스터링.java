import java.util.ArrayList;
import java.util.List;

public class Solution_KAKAO_뉴스클러스터링 {
	public static int solution(String str1, String str2) {
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		List<String> words = new ArrayList<>();
		List<String> A = new ArrayList<>();
		List<String> B = new ArrayList<>();
		
		for(int i=1;i<str1.length();i++) {
			if((65 <= str1.charAt(i-1) && str1.charAt(i-1) <= 90) && 
					(65 <= str1.charAt(i) && str1.charAt(i) <= 90)) {
				String word = ""; 
				word += str1.charAt(i-1);
				word += str1.charAt(i);
				
				A.add(word);
				words.add(word);
			}
		}
		
		for(int i=1;i<str2.length();i++) {
			if((65 <= str2.charAt(i-1) && str2.charAt(i-1) <= 90) && 
					(65 <= str2.charAt(i) && str2.charAt(i) <= 90)) {
				String word = ""; 
				word += str2.charAt(i-1);
				word += str2.charAt(i);
				
				B.add(word);
				words.add(word);
			}
		}
		
		int intersection = 0;
		for(String word : words) {
			if(A.contains(word) && B.contains(word)) {
				A.remove(word);
				B.remove(word);
				intersection++;
			}
		}
		
		int union = words.size() - intersection;

		if(intersection == 0 && union == 0) 
			return 65536;
		
		double jaccard = ((1.0 * intersection) / union) * 65536;
		return (int) jaccard;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("FRANCE", "french"));
		System.out.println(solution("handshake", "shake hands"));
		System.out.println(solution("aa1+aa2", "AAAA12"));
		System.out.println(solution("E=M*C^2", "e=m*c^2"));
	}
}