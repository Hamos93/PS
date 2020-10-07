import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1074_Z {
	private static int N, R, C, cnt;
	
	public static void paint(int n, int r, int c) {
		if(n == 2) {
			if(r == R && c == C) {
				System.out.print(cnt);
				return;
			}
			
			cnt++;
			
			if(r == R && c + 1 == C) {
				System.out.print(cnt);
				return;
			}

			cnt++;
			
			if(r + 1 == R && c == C) {
				System.out.print(cnt);
				return;
			}
			
			cnt++;
			
			if(r + 1 == R && c + 1 == C) {
				System.out.print(cnt);
				return;
			}

			cnt++;
			
			return;
		}
		
		paint(n/2, r, c);
		paint(n/2, r, c + n/2);
		paint(n/2, r + n/2, c);
		paint(n/2, r + n/2, c + n/2);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
	
		cnt = 0;
		paint((int)(Math.pow(2, N)), 0, 0);
	}
}