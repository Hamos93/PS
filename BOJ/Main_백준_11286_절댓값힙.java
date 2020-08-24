import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

class ComparatorAbs implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		if(Math.abs(o1) > Math.abs(o2)) return 1;
		else if(Math.abs(o1) == Math.abs(o2)) {
			if(o1 > o2) return 1;
		}
		
		return -1;
	}
}

public class Main_백준_11286_절댓값힙 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new ComparatorAbs());
		
		while(!pq.isEmpty()) System.out.println(pq.poll());
		
		int N = Integer.parseInt(br.readLine());
		while(0 < N--) {
			int x = Integer.parseInt(br.readLine());
		
			if(x != 0) pq.add(x);
			else {
				if(!pq.isEmpty()) sb.append(pq.poll() + "\n");
				else sb.append("0\n");
			}
		}

		System.out.print(sb.toString().trim());
	}
}