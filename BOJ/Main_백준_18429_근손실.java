import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_18429_근손실 {
	private static int N, K;
	private static int[] A;
	private static int[] res;
	private static boolean[] visit;
	private static int cnt;
	
	public static void permutation(int N, int R, int depth) {
		if(depth == R) {
			int muscle = 500;
			boolean flag = true;
			
			for(int i=0;i<R;i++) {
				muscle += res[i];
				muscle -= K;
				
				if(muscle < 500) {
					flag = false;
					break;
				}
			}
			
			if(flag) cnt++;
			
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = A[i];
				
				permutation(N, N, depth + 1);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		A = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		res = new int[N];
		visit = new boolean[N];
		
		cnt = 0;
		permutation(N, N, 0);
		
		System.out.print(cnt);
	}
}