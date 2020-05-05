import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2133_타일채우기 {
	private static final int TILE = 30;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[] d = new int[TILE + 1];
		// d[i] = d[i-2] * 3 + d[i-4] * 2 + d[i-6] * 2 + ... + d[0] * 2
		d[0] = 1;
		d[2] = 3;

		for(int i=4;i<=TILE;i+=2) {
			d[i] = d[i - 2] * 3;
			for(int j=i-4;0<=j;j-=2)
				d[i] += d[j] * 2;
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		
		System.out.print(d[N]);
	}
}
