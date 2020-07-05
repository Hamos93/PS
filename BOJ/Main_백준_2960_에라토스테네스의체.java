import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2960_에라토스테네스의체 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		boolean[] prime = new boolean[N+1];
		prime[0] = true; prime[1] = true;
		
		int cnt = 0;
		for(int i=2;i<=N;i++) {
			if(!prime[i]) {
				cnt++;
				
				if(cnt == K) {
					System.out.println(i);
					return;
				}
			
				for(int j=i+i;j<=N;j+=i) {
					if(!prime[j]) {
						cnt++;
						
						prime[j] = true;
						
						if(cnt == K) {
							System.out.println(j);
							return;
						}
					}
				}
			}
		}
	}
}