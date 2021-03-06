import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_12738_가장긴증가하는부분수열3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		int[] LIS = new int[N];
		LIS[0] = A[0];
		
		int idx = 0;
		for(int i=1;i<N;i++) {
			if(LIS[idx] < A[i]) LIS[++idx] = A[i];
			else {
				int low = 0, high = idx;
				while(low < high) {
					int mid = (low + high) / 2;
					
					if(LIS[mid] < A[i]) low = mid + 1;
					else high = mid;
				}
				
				LIS[high] = A[i];
			}
		}
		
		System.out.print(idx + 1);
	}
}