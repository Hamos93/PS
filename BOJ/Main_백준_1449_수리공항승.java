import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_1449_수리공항승 {
	public static void main(String[] args) throws Exception {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
	
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);

		int cnt = 0;
		for(int i=0;i<N;i++) {
			int x = arr[i];
			double x1 = x - 0.5;
			double x2 = x1 + L;
			
			cnt++;
			
			int idx = i;
			for(int j=i;j<N;j++) {
				if(x1 <= arr[j] && arr[j] <= x2) idx = j;
			}
			
			i = idx;
		}
		
		System.out.print(cnt);
	}
}