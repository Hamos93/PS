import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1904_01타일 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		long[][] D = new long[1000001][2];
		D[1][0] = 0; D[1][1] = 1;
		D[2][0] = 1; D[2][1] = 1;
		
		for(int i=3;i<=N;i++) {
			D[i][0] = (D[i-1][0] + D[i-2][0]) % 15746;
			D[i][1] = (D[i-1][1] + D[i-2][1]) % 15746;
		}
		
		System.out.print((D[N][0] + D[N][1]) % 15746);
	}
}