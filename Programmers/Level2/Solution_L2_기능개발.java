import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution_L2_기능개발 {
	public static int[] solution(int[] progresses, int[] speeds) {
		LinkedList<Integer> queue = new LinkedList<>();
		
		for(int i=0;i<progresses.length;i++) {
			int progress = 100 - progresses[i];
			int speed = speeds[i];
			
			if(progress % speed == 0) queue.offer(progress / speed);
			else queue.offer(progress / speed + 1);
		}
	
		List<Integer> list = new ArrayList<>();
		while(!queue.isEmpty()) {
			int peek = queue.poll();
			int cnt = 1;
			
			while(!queue.isEmpty() && queue.peek() <= peek) {
				queue.poll();
				cnt++;
			}
			
			list.add(cnt);
		}
		
		int[] answer = new int[list.size()];
		for(int i=0;i<list.size();i++)
			answer[i] = list.get(i);
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.print(Arrays.toString(solution(new int[] { 95, 95, 95, 95 }, new int[] { 4, 3, 2, 1 })));
	}
}