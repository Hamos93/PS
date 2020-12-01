import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_7795_먹을것인가먹힐것인가 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] A = new int[N];
			int[] B = new int[M];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				A[i] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<M;i++)
				B[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(B);
			
			int cnt = 0;
			for(int i=0;i<N;i++) {
				int value = A[i];
			
				int low = 0, high = M - 1;
				int idx = -1;
				while(low <= high) {
					int mid = (low + high) / 2;
					
					if(B[mid] < value) {
						idx = mid;
						low = mid + 1;
					}else high = mid - 1;
				}
				
				cnt += (idx + 1);
			}
			
			System.out.println(cnt);
		}
	}
}