import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1010_다리놓기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		// d[N][M]: N개의 사이트와 M개의 사이트를 연결하는 모든 경우의 수
		int[][] d = new int[31][31];
		for(int i=1;i<=30;i++) d[1][i] = i;
		for(int i=2;i<=30;i++) {
			for(int j=i;j<=30;j++) {
				for(int k=j-1;1<=k;k--)
					d[i][j] += d[i-1][j-k];
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			System.out.println(d[N][M]);
		}
	}
}