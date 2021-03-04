import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_1655_가운데를말해요 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

		int N = Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int value = Integer.parseInt(st.nextToken());
			
			if(i == 0) {
				maxHeap.offer(value);
				sb.append(maxHeap.peek() + "\n");
			
				continue;
			}
			
			if(maxHeap.peek() <= value) minHeap.offer(value);
			else maxHeap.offer(value);
			
			if(maxHeap.size() != minHeap.size() && maxHeap.size() - minHeap.size() != 1) {
				if(minHeap.size() < maxHeap.size()) minHeap.offer(maxHeap.poll());
				else maxHeap.offer(minHeap.poll());
			}
			
			sb.append(maxHeap.peek() + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}