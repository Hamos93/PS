import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10158_개미 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int t = Integer.parseInt(st.nextToken());

		p += t; q += t;
		p %= (2 * h); q %= (2 * w);
		
		if(h < p) p = 2 * h - p;
		if(w < q) q = 2 * w - q;
		
		System.out.print(p + " " + q);
	}
} 