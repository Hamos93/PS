
public class Solution_L3_네트워크 {
	private static int cnt = 0;
	private static boolean[] visit;
	
	public static void dfs(int node, int n, int[][] computers) {
		visit[node] = true;
		
		for(int next=0;next<n;next++) {
			if(node == next) continue;
			
			if(!visit[next] && computers[node][next] == 1)
				dfs(next, n, computers);
		}
	}
	
	public static int solution(int n, int[][] computers) {
		visit = new boolean[n];
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				cnt++;
				
				dfs(i, n, computers);
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		System.out.println(solution(3, computers));
	}
}