import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_KAKAO_튜플 {
	public static int[] solution(String s) {
		int[] number = new int[100001];
		
		for(int i=0;i<s.length();i++) {
			int ch = s.charAt(i) - '0';
			if(0 <= ch && ch <= 9) {
				String value = Integer.toString(ch); 
				for(int j=i+1;j<s.length();j++) {
					if(0 <= s.charAt(j) - '0' && s.charAt(j) - '0' <= 9) {
						value += s.charAt(j);
					}else {
						i = j;
						break;
					}
				}
				number[Integer.parseInt(value)]++;
			}
		}
		
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] < o2[1]) return 1;
				return -1;
			}
		});

		for(int i=1;i<=100000;i++) {
			if(number[i] != 0) pq.offer(new int[] { i, number[i] });
		}
		
		int[] answer = new int[pq.size()];
		for(int i=0;i<answer.length;i++)
			answer[i] = pq.poll()[0];
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("{{2}, {2,1}, {2,1,3}, {2,1,3,4}}")));
		System.out.println(Arrays.toString(solution("{{1,2,3}, {2,1}, {1,2,4,3}, {2}}")));
		System.out.println(Arrays.toString(solution("{{20,111}, {111}}")));
		System.out.println(Arrays.toString(solution("{{123}}")));
		System.out.println(Arrays.toString(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));
	}
}