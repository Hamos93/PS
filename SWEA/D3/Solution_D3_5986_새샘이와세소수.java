import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5986_새샘이와세소수 {
	private static int[] data;
	private static int[] res;
	private static int cnt;
	
	private static void homogeneous(int N, int R, int num, int depth, int start) {
		if(depth == R) {
			if((res[0] + res[1] + res[2]) == num) cnt++;
			
			return;
		}
		
		for(int i=start;i<N;i++) {
			res[depth] = data[i];
			
			homogeneous(N, R, num, depth + 1, i);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] prime = new boolean[1000];
		prime[0] = true; prime[1] = true;
		
		for(int i=2;i<=999;i++) {
			if(!prime[i]) {
				for(int j=i+i;j<=999;j+=i)
					if(!prime[j]) prime[j] = true;
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
		
			int N = Integer.parseInt(st.nextToken());
			int len = 0;
			
			for(int i=2;i<=N;i++)
				if(!prime[i]) len++;
			
			data = new int[len];
			int k = 0;
			for(int i=2;i<=N;i++) {
				if(!prime[i]) data[k++] = i;
			}
			
			res = new int[3];
			cnt = 0;
			
			homogeneous(len, 3, N, 0, 0);

			sb.append("#" + tc + " " + cnt + "\n");
		}
		
		System.out.print(sb.toString());
	}
}