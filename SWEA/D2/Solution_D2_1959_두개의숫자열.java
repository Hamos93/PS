import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1959_두개의숫자열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			boolean flag = N > M ? true : false;
			
			int[] A = new int[N];
			int[] B = new int[M];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				A[i] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<M;i++)
				B[i] = Integer.parseInt(st.nextToken());
			
			if(!flag) {
				int[] tmp = A.clone();
				A = B.clone();
				B = tmp.clone();
			}
			
			int answer = 0;
			for(int i=0;i<=(A.length - B.length);i++) {
				int result = 0;
				for(int j=0;j<B.length;j++)
					result += A[i+j] * B[j];
				
				answer = answer < result ? result : answer;
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}