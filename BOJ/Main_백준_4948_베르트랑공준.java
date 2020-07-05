import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_4948_베르트랑공준 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int max = 123456 * 2;
		
		boolean[] prime = new boolean[max + 1];
		prime[0] = true; prime[1] = true;
		
		for(int i=2;i<=max;i++) {
			if(!prime[i]) {
				for(int j=i+i;j<=max;j+=i) {
					if(!prime[j]) prime[j] = true;
				}
			}
		}
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			if(n == 0) return;

			int answer = 0;
			for(int i=n+1;i<=2*n;i++) {
				if(!prime[i]) answer++;
			}
			
			System.out.println(answer);
		}
	}
}