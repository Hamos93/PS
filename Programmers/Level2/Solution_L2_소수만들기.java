
public class Solution_L2_소수만들기 {
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static int cnt;
	
	public static void combination(int N, int R, int depth, int start) {
		if(depth == R) {
			int sum = 0;
			for(int i=0;i<R;i++)
				sum += res[i];
			
			boolean flag = true;
			for(int i=2;i<=sum-1;i++) {
				if(sum % i == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) cnt++;
			
			return;
		}
		
		for(int i=start;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = data[i];
				
				combination(N, R, depth + 1, i);
				
				visit[i] = false;
			}
		}
	}
	
	public static int solution(int[] nums) {
		int N = nums.length;
		
		data = nums.clone();
		res = new int[3];
		visit = new boolean[N];
		
		cnt = 0;
		combination(N, 3, 0, 0);
		
		int answer = cnt;
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4 }));
		System.out.println(solution(new int[] { 1, 2, 7, 6, 4 }));
	}
}