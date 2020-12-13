import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1806_부분합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
	
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int result = Integer.MAX_VALUE;
		int start = 0, end = 0;
		int sum = arr[end], len = 1;
		
		while(true) {
			if(sum < S) {
				end++; len++;
				
				if(N <= end) break;
				
				sum += arr[end];
			}else {
				result = Math.min(result, len);
				
				sum -= arr[start];
				len--; start++;
			}
		}
		
		if(result == Integer.MAX_VALUE) System.out.print("0");
		else System.out.print(result);
	}
}