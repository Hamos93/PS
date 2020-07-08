import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_3896_소수사이수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = 1299709;
		boolean[] prime = new boolean[size + 1];
		prime[0] = true; prime[1] = true;
		
		for(int i=2;i<=size;i++) {
			if(!prime[i]) {
				for(int j=i+i;j<=size;j+=i)
					prime[j] = true;
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int k = Integer.parseInt(st.nextToken());
			if(!prime[k]) {
				System.out.println("0");
				continue;
			}
			
			int i = k + 1, cnt = 1;
			while(true) {
				if(!prime[i]) break;
				
				cnt++; i++;
			}
			
			int j = k - 1;
			while(true) {
				if(!prime[j]) break;
				
				cnt++; j--;
			}
			
			System.out.println(cnt + 1);
		}
	}
}