import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2720_세탁소사장동혁 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] change = { 25, 10, 5, 1 };
		
		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			st = new StringTokenizer(br.readLine(), " ");
			int C = Integer.parseInt(st.nextToken());

			int[] cnt = new int[4];
			for(int i=0;i<4;i++) {
				cnt[i] = C / change[i];
				C -= cnt[i] * change[i];
				
				if(i == 3) sb.append(cnt[i] + "\n");
				else sb.append(cnt[i] + " ");
			}
		}
		
		System.out.print(sb.toString().trim());
	}
}