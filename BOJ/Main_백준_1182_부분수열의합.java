import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1182_부분수열의합 {
	private static int[] arr;
	private static int N, S, cnt;
	
	public static void solve(int idx, int sum) {
		if(idx == N) {
			if(sum == S) cnt++;
			
			return;
		}		

		solve(idx + 1, sum + arr[idx]);
		solve(idx + 1, sum);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());

		arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		cnt = 0;
		solve(0, 0);
		
		if(S == 0) cnt--;
		
		System.out.print(cnt);
	}
}