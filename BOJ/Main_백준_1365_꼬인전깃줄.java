import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1365_꼬인전깃줄 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int[] LIS = new int[N];
		LIS[0] = arr[0];
		
		int idx = 0;
		for(int i=1;i<N;i++) {
			if(LIS[idx] < arr[i]) LIS[++idx] = arr[i];
			else {
				int low = 0, high = idx;
				
				while(low < high) {
					int mid = (low + high) / 2;
					
					if(LIS[mid] < arr[i]) low = mid + 1;
					else high = mid;
				}
				
				LIS[high] = arr[i];
			}
		}
		
		if(N > idx + 1) System.out.print(N - (idx + 1));
		else System.out.print(idx + 1);
	}
}