import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_15990_123더하기5 {
	public static void main(String[] args) throws Exception {
		// d[i][j]: i를 1, 2, 3의 합으로 나타내는 방법의 수, 마지막에 사용한 수는 j
		long[][] d = new long[100001][4];
		d[1][1] = 1; d[1][2] = 0; d[1][3] = 0; 
		d[2][1] = 0; d[2][2] = 1; d[2][3] = 0; 
		d[3][1] = 1; d[3][2] = 1; d[3][3] = 1;
		
		for(int i=4;i<=100000;i++) {
			d[i][1] = (d[i-1][2] + d[i-1][3]) % 1000000009;
			d[i][2] = (d[i-2][1] + d[i-2][3]) % 1000000009;
			d[i][3] = (d[i-3][1] + d[i-3][2]) % 1000000009;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());

			System.out.println((d[n][1] + d[n][2] + d[n][3]) % 1000000009);
		}
	}
}