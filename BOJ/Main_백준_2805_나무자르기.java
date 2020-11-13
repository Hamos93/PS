import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2805_나무자르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] height = new int[N];
		int maxHeight = 0;

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			height[i] = Integer.parseInt(st.nextToken());

			maxHeight = Math.max(height[i], maxHeight);
		}

		int start = 0, end = maxHeight;
		int H = 0;
		while(start <= end) {
			int mid = (start + end) / 2;
			long sum = 0;

			for(int i=0;i<N;i++)
				if(mid < height[i]) 
					sum += height[i] - mid;

			if(sum < M) end = mid - 1;
			else {
				H = mid;
				start = mid + 1;
			}
		}
		
		System.out.print(H);
	}
}