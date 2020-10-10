import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13458_시험감독 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st1.nextToken());

		st1 = new StringTokenizer(br.readLine(), " ");
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " "); 
		int B = Integer.parseInt(st2.nextToken());
		int C = Integer.parseInt(st2.nextToken());
	
		long cnt = 0;
		while(st1.hasMoreTokens()) {
			int A = Integer.parseInt(st1.nextToken());
			
			A -= B;
			cnt++;
			
			if(A <= 0) continue;
			
			if(A <= C) {
				cnt++;

				continue;
			}
			
			int div = A / C;
			cnt += div;
	
			A -= div * C;
			if(A != 0) cnt++;
		}
		
		System.out.print(cnt);
	}
}