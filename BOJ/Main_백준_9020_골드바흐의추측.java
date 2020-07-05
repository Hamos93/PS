import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_9020_골드바흐의추측 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] prime = new boolean[10001];
		prime[0] = true; prime[1] = true;

		for(int i=2;i<=10000;i++) {
			if(!prime[i]) {
				for(int j=i+i;j<=10000;j+=i) {
					if(!prime[j]) prime[j] = true;
				}
			}
		}

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int n = Integer.parseInt(st.nextToken());

			int i = n/2, j = n/2;
			while(true) {
				if(!prime[i] && !prime[j]) {
					if(i + j == n) break;
				}
				
				i--; j++;
			}

			System.out.println(i + " " + j);
		}
	}
}