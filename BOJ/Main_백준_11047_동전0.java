import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11047_동전0 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] money = new int[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			money[i] = Integer.parseInt(st.nextToken());
		}
		
		int idx = money.length - 1, answer = 0;
		while(true) {
			if(K == 0) break;
			
			int cnt = K / money[idx];
			K -= cnt * money[idx--];
			answer += cnt;
		}
		
		System.out.print(answer);
	}
}