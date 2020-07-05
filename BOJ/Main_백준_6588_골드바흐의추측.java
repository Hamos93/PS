import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_6588_골드바흐의추측 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		boolean[] prime = new boolean[1000001];
		prime[0] = true; prime[1] = true;

		for(int i=2;i<=1000000;i++) {
			if(!prime[i]) {
				for(int j=i+i;j<=1000000;j+=i) {
					if(!prime[j]) prime[j] = true;
				}
			}
		}

		while(true) {
			st = new StringTokenizer(br.readLine(), " ");

			int n = Integer.parseInt(st.nextToken());
			if(n == 0) return;

			boolean flag = false;
			for(int i=3;i<=n;i++) {
				if(!prime[i] && !prime[n-i]) {
					flag = true;
					
					System.out.println(n + " = " + i + " + " + (n-i));
					break;
				}
			}
			
			if(!flag) System.out.println("Goldbach's conjecture is wrong.");
		}
	}
}