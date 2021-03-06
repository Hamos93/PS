import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_L1_두개뽑아서더하기 {
	public static int[] solution(int[] numbers) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				int sum = numbers[i] + numbers[j];
			
				if(!list.contains(sum)) list.add(sum);
			}
		}
		
		Collections.sort(list);
		
		int[] answer = new int[list.size()];
		for(int i=0;i<answer.length;i++)
			answer[i] = list.get(i);
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {2, 1, 3, 4, 1})));
	}
}