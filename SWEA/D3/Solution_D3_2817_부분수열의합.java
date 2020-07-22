import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_2817_부분수열의합 {
	private static int[] arr;
	private static int cnt;
	
	private static void sum(int idx, int total, int K, int N) {
		if(idx == N && total == K) {
			cnt++;
			
			return;
		}
		
		if(idx == N && total != K) return; 
		
		sum(idx + 1, total + arr[idx], K, N);
		sum(idx + 1, total, K, N);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			arr = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				arr[i] = Integer.parseInt(st.nextToken());
			
			cnt = 0;
			sum(0, 0, K, N);
		
			System.out.println("#" + tc + " " + cnt);
		}
	}
}