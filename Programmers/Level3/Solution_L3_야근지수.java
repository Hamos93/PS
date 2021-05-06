import java.util.Collections;
import java.util.PriorityQueue;

public class Solution_L3_야근지수 {
	public static long solution(int n, int[] works) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int work : works)
			pq.offer(work);
		
		while(0 < n--) {
			if(pq.isEmpty()) break;
			
			int work = pq.poll() - 1;
			if(0 < work) pq.offer(work);
		}
	
		long answer = 0;
		while(!pq.isEmpty()) {
			int work = pq.poll();
			answer += (work * work);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(4, new int[] { 4, 3, 3 }));
		System.out.println(solution(1, new int[] { 2, 1, 2 }));
		System.out.println(solution(3, new int[] { 1, 1 }));
	}
}