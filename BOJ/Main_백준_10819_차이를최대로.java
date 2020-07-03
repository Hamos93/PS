import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10819_차이를최대로 {
	private static int[] A;
	private static int[] res;
	private static boolean[] visit;
	private static int answer;
	
	private static void permutation(int n, int r, int depth) {
		if(depth == r) {
			int result = 0;
			
			for(int i=0;i<r-1;i++)
				result += Math.abs(res[i] - res[i+1]);
			
			answer = answer < result ? result : answer;
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = A[i];
				
				permutation(n, r, depth + 1);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		A = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		res = new int[N];
		visit = new boolean[N];
		
		answer = 0;
		permutation(N, N, 0);
		
		System.out.print(answer);
	}
}