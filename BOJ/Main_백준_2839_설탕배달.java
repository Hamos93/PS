import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2839_설탕배달 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int cnt = Integer.MAX_VALUE;
		if(N % 5 == 0) cnt = Math.min(cnt, N / 5);
		if(N % 3 == 0) cnt = Math.min(cnt, N / 3);
		
		int idx = 1;
		while(true) {
			int sugar = N;
			int bag5 = idx;
			
			sugar -= (5 * bag5);
			
			if(sugar <= 0) break;
			
			if(sugar % 3 == 0) {
				int bag3 = sugar / 3;
			
				cnt = Math.min(cnt, bag5 + bag3);
			}
			
			idx++;
		}
		
		if(cnt == Integer.MAX_VALUE) System.out.print("-1");
		else System.out.print(cnt);
	}
}