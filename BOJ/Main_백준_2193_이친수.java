import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2193_이친수 {
	private static final int NUM = 90; 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		// d[N][0]: 길이가 N자리이면서 0으로 끝나는 이친수의 개수
		// d[N][1]: 길이가 N자리이면서 1로 끝나는 이친수의 개수
		long[][] d = new long[NUM + 1][2];
		d[1][0] = 0;
		d[1][1] = 1;
		
		for(int i=2;i<NUM+1;i++) {
			d[i][0] = d[i-1][0] + d[i-1][1];
			d[i][1] = d[i-1][0];
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		
		System.out.print(d[N][0] + d[N][1]);
	}
}