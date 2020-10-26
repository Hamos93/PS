import java.util.LinkedList;

public class Solution_L2_프린터 {
    public static int solution(int[] priorities, int location) {
     	LinkedList<int[]> queue = new LinkedList<>();
    	for(int i=0;i<priorities.length;i++) {
    		if(i == location) queue.offer(new int[] { priorities[i], 1 });
    		else queue.offer(new int[] { priorities[i], 0 });
    	}
    	
    	int cnt = 0;
    	while(true) {
    		int[] poll = queue.poll();
    		int priority = poll[0], document = poll[1];
    		
    		boolean flag = true;
    		for(int i=0;i<queue.size();i++) {
    			if(priority < queue.get(i)[0]) {
    				flag = false;
    				break;
    			}
    		}
    		
    		if(!flag) queue.offer(poll);
    		else {
    			cnt++;
    			
    			if(document == 1) break;
    		}
    	}
    
    	return cnt;
    }
    
	public static void main(String[] args) {
		System.out.print(solution(new int[] { 1, 1, 9, 1, 1, 1 }, 0));
	}
}