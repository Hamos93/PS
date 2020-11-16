import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2343_기타레슨 {
	private static int N, M;
	private static int[] lesson;
	
	public static boolean possible(long mid) {
		int cnt = 0, sum = 0;
		
		for(int i=0;i<N;i++) {
			if(sum + lesson[i] <= mid) sum += lesson[i];
			else {
				cnt++;
				sum = lesson[i];
			}
		}
		
		if(sum != 0) cnt++;
		
		return cnt <= M;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		lesson = new int[N];
	
		st = new StringTokenizer(br.readLine(), " ");
		
		int total = 0;
		for(int i=0;i<N;i++) {
			lesson[i] = Integer.parseInt(st.nextToken());
			total += lesson[i];
		}
		
		int low = 1, high = total;
		int bluelay = Integer.MAX_VALUE;
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(possible(mid)) {
				int result = 0, sum = 0;
				
				for(int i=0;i<N;i++) {
					if(sum + lesson[i] <= mid) sum += lesson[i];
					else {
						result = Math.max(result, sum);
						sum = lesson[i];
					}
				}
				
				result = Math.max(result, sum);
				bluelay = Math.min(bluelay, result);
				
				high = mid - 1;
			}else low = mid + 1;
		}
		
		System.out.print(bluelay);
	}
}