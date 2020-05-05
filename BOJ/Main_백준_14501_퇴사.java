import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14501_퇴사 {
	private static int N, answer;
	private static int[] T;
	private static int[] P;

	private static void go(int day, int money) {
		if(N+1 == day) {
			answer = answer < money ? money : answer;
			return;
		}
		
		if(N+1 < day) return;
		
		go(day + T[day], money + P[day]);
		go(day + 1, money);
	}
	
 	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		T = new int[N+1];
		P = new int[N+1];
		
		for(int i=1;i<N+1;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		answer = 0;
		go(1, 0);
		
		System.out.print(answer);
 	}
}