import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_20299_3대측정 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int x3 = Integer.parseInt(st.nextToken());
		
			if(x1 < L || x2 < L || x3 < L) continue;
			if((x1 + x2 + x3) < K) continue;
			
			sb.append(x1 + " " + x2 + " " + x3 + " ");
			cnt++;
		}
	
		System.out.println(cnt);
		System.out.print(sb.toString().trim());
	}
}