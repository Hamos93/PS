import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_4796_캠핑 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int T = 1;
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
		
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
		
			if(L == 0 && P == 0 && V == 0) break;
			
			int day = V / P * L;
			int remainder = L < (V % P) ? L : V % P;
			
			System.out.println("Case " + T++ + ": " + (day + remainder));
		}
	}
}