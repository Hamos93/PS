import java.util.Arrays;
import java.util.Comparator;

public class Solution_L1_문자열내마음대로정렬하기 {
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(n) > o2.charAt(n)) return 1;
				else if(o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
				else if(o1.charAt(n) < o2.charAt(n)) return -1;
				else return 0;
			}
		});
		
		return strings;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "sun", "bed", "car" }, 1)));
	}
}