import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_L1_모의고사 {
	public static int[] solution(int[] answers) {
		int[] p1 = { 1, 2, 3, 4, 5 };
		int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] p3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] cnt = new int[3];
		for(int i=0;i<answers.length;i++) {
			if(p1[i % p1.length] == answers[i]) cnt[0]++;
			if(p2[i % p2.length] == answers[i]) cnt[1]++;
			if(p3[i % p3.length] == answers[i]) cnt[2]++;
		}

		int max = Integer.MIN_VALUE;
		for(int i=0;i<3;i++) {
			if(max < cnt[i]) max = cnt[i];
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<3;i++) {
			if(max == cnt[i]) list.add(i + 1);
		}
		
		int[] answer = new int[list.size()];
		for(int i=0;i<answer.length;i++)
			answer[i] = list.get(i);
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4, 5 })));
	}
}