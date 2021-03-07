import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2352_반도체설계 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int[] LIS = new int[n];
		LIS[0] = arr[0];
		
		int idx = 0;
		for(int i=1;i<n;i++) {
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

		System.out.print(idx + 1);
	}
}