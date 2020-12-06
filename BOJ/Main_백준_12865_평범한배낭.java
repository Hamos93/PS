import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_12865_평범한배낭 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
	
		int[][] D = new int[N + 1][K + 1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int weight = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
		
			for(int j=1;j<=K;j++) {
				if(j < weight) D[i][j] = D[i-1][j];
				else D[i][j] = Math.max(D[i-1][j], D[i-1][j - weight] + value);
			}
		}
		
		System.out.print(D[N][K]);
	}
}