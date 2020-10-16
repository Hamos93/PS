import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1747_소수팰린드롬 {
	public static void main(String[] args) throws Exception {
		boolean[] prime = new boolean[1003002];
		prime[0] = prime[1] = true;
		
		for(int i=2;i<=1003001;i++) {
			for(int j=i+i;j<=1003001;j+=i)
				if(!prime[j]) prime[j] = true;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		while(true) {
			if(!prime[N]) {
				StringBuilder sb = new StringBuilder();
				sb.append(N);
				
				if(sb.toString().equals(sb.reverse().toString())) {
					System.out.print(N);
					
					return;
				}
			}
			
			N++;
		}
	}
}