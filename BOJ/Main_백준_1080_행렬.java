import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1080_행렬 {
	private static int[][] A;
	private static int[][] B;
	
	public static boolean isSame() {
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++)
				if(A[i][j] != B[i][j]) return false;
		}
		
		return true;
	}
	
	public static void change(int x, int y) {
		for(int i=x;i<x+3;i++) {
			for(int j=y;j<y+3;j++)
				A[i][j] ^= 1;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		A = new int[N][M];
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<M;j++)
				A[i][j] = input.charAt(j) - '0';
		}
		
		B = new int[N][M];
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<M;j++)
				B[i][j] = input.charAt(j) - '0';
		}
		
		int cnt = 0;
		if(N < 3 || M < 3) {
			if(isSame()) System.out.print("0");
			else System.out.print("-1");
		}else {
			for(int i=0;i<=N-3;i++) {
				for(int j=0;j<=M-3;j++) {
					if(A[i][j] != B[i][j]) {
						change(i, j);
						cnt++;
					}
				}
			}
			
			if(isSame()) System.out.print(cnt);
			else System.out.print("-1");
		}
	}
}