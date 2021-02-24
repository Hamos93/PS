import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1051_숫자정사각형 {
	public static boolean isSame(int n1, int n2, int n3, int n4) {
		if(n1 == n2 && n2 == n3 && n3 == n4 && n4 == n1) return true;
		
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][M];
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<M;j++)
				arr[i][j] = input.charAt(j) - '0';
		}
		
		int K = N <= M ? N : M;
		for(int k=K;1<=k;k--) {
			for(int i=0;i<=N-k;i++) {
				for(int j=0;j<=M-k;j++) {
					if(isSame(arr[i][j], arr[i][j+k-1], arr[i+k-1][j], arr[i+k-1][j+k-1])) {
						System.out.print(k * k);
						return;
					}
				}
			}
		}
	}
}