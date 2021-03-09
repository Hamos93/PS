import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11659_구간합구하기4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int[] P = new int[N + 1];
		int sum = 0;
		
		for(int i=0;i<N;i++) {
			sum += arr[i];
			P[i + 1] = sum;
		}
		
		StringBuilder sb = new StringBuilder();
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());

			sb.append((P[right] - P[left - 1]) + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}