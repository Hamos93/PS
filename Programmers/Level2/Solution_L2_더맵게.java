import java.util.PriorityQueue;

public class Solution_L2_더맵게 {
	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int s : scoville)
			pq.offer(s);
		
		int cnt = 0;
		while(1 < pq.size() && pq.peek() < K) {
			int food1 = pq.poll();
			int food2 = pq.poll();
			
			pq.offer(food1 + (food2 * 2));
			
			cnt++;
		}
		
		return K <= pq.peek() ? cnt : -1;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[]{ 1, 2, 3, 9, 10, 12 }, 7));
	}
}