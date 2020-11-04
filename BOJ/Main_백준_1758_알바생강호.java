import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_1758_알바생강호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] tip = new int[N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			tip[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(tip);
		
		long total = 0, order = 1;
		for(int i=N-1;0<=i;i--) {
			long result = tip[i] - (order - 1);
			
			if(0 < result) total += result;
			order++;
		}
		
		System.out.print(total);
	}
}