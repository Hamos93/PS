
public class Solution_L3_입국심사 {
    public static boolean isPossible(long mid, int n, int[] times) {
    	long cnt = 0;
    	for(int i=0;i<times.length;i++)
    		cnt += mid / times[i];
    
    	return n <= cnt;
    }
    
	public static long solution(int n, int[] times) {
    	long max = 0;
    	for(int time : times)
    		max = Math.max(max, time);
    	
    	long low = 1, high = n * max;
    	long result = Long.MAX_VALUE;
    	while(low <= high) {
    		long mid = (low + high) / 2;
    	
    		if(isPossible(mid, n, times)) {
    			result = Math.min(result, mid);
    			high = mid - 1;
    		}else low = mid + 1;
    	}
    	
        return result;
    }
    
    public static void main(String[] args) {
		System.out.println(solution(6, new int[] { 7, 10 } ));
	}
}