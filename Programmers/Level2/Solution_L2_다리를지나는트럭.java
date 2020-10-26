import java.util.LinkedList;

public class Solution_L2_다리를지나는트럭 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
    	LinkedList<Integer> waiting = new LinkedList<>();
    	for(int i=0;i<truck_weights.length;i++)
    		waiting.offer(truck_weights[i]);
    	
    	LinkedList<int[]> driving = new LinkedList<>();

    	int second = 0;
    	while(true) {
    		int w = 0;
    		for(int i=0;i<driving.size();i++)
    			w += driving.get(i)[0];
    		
    		if(!waiting.isEmpty() && w + waiting.peek() <= weight) driving.offer(new int[] { waiting.poll(), 0 });
    		
    		second++;
    		for(int i=0;i<driving.size();i++) {
    			int[] get = driving.get(i);
    			driving.set(i, new int[] { get[0], get[1] + 1 });
    		}
    		
    		for(int i=0;i<driving.size();i++)
    			if(driving.get(i)[1] == bridge_length) {
    				driving.poll();
    				break;
    			}
    		
    		if(driving.isEmpty() && waiting.isEmpty()) break;
    	}
    
    	return second + 1;
    }
    
	public static void main(String[] args) {
		System.out.println(solution(2, 10, new int[] { 7, 4, 5, 6 }));
	}
}