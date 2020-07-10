import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_18883_NM찍기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][M];
		int cnt = 1;
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++) arr[i][j] = cnt++;

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(j == M-1) sb.append(arr[i][j] + "\n");
				else sb.append(arr[i][j] + " ");
			}
		}
		
		System.out.print(sb.toString());
	}
}