import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11048_이동하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N + 1][M + 1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1;j<=M;j++) {
				int value = Integer.parseInt(st.nextToken());
				
				arr[i][j] = Math.max(Math.max(arr[i-1][j-1], arr[i-1][j]), arr[i][j-1]) + value;
			}
		}
		
		System.out.print(arr[N][M]);
	}
}