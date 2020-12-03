import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2156_포도주시식 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] wine = new int[10001];
		
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			wine[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] D = new int[10001];
		D[1] = wine[1]; D[2] = wine[1] + wine[2];
		
		for(int i=3;i<=n;i++)
			D[i] = Math.max(Math.max(D[i-1], D[i-2] + wine[i]), D[i-3] + wine[i-1] + wine[i]);
		
		System.out.print(D[n]);
	}
}