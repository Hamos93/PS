import java.util.Arrays;
import java.util.HashSet;

public class Solution_L2_영어끝말잇기 {
	public static int[] solution(int n, String[] words) {
		boolean flag = true;
		int no = 0, cnt = 0;
		char ch = ' ';
		HashSet<String> set = new HashSet<>();
		
		for(int i=0;i<words.length;i++) {
			if(i == 0) {
				ch = words[i].charAt(words[i].length() - 1);
				set.add(words[i]);
				
				no++;
				cnt++;
				
				continue;
			}
			
			no++;
			
			if(n < no) {
				no = 1;
				cnt++;
			}
			
			if(ch != words[i].charAt(0) || set.contains(words[i])) {
				flag = false;
				break;
			}
			
			ch = words[i].charAt(words[i].length() - 1);
			set.add(words[i]);
		}
		
		if(flag) return new int[] { 0, 0 };
		return new int[] { no, cnt };
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
		System.out.println(Arrays.toString(solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
		System.out.println(Arrays.toString(solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"})));
	}
}