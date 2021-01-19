import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2230_수고르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
				
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int left = 0, right = 1, result = 2 * (int)(1e9);
		while(left < N && right < N) {
			int diff = arr[right] - arr[left];
			
			if(diff < M) right++;
			else if(diff == M) {
				result = M;
				break;
			}else {
				result = Math.min(result, diff);
				left++;
			}
		}
		
		System.out.print(result);
	}
}