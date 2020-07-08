import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1644_소수의연속합 {
	private static boolean[] prime;
	private static final int SIZE = 4000000;

	private static boolean sequence(int i, int sum, int N) {
		if(N < sum) return false;
		if(N == sum) return true;

		int j = i + 1;
		while(true) {
			if(SIZE < j) return false;
			if(!prime[j]) break;
			
			j++;
		}
		
		return sequence(j, sum + j, N);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		prime = new boolean[SIZE + 1];
		prime[0] = true; prime[1] = true;

		for(int i=2;i<=SIZE;i++) {
			if(!prime[i]) {
				for(int j=i+i;j<=SIZE;j+=i) 
					prime[j] = true;
			}
		}

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());

		int answer = 0;
		for(int i=2;i<=N;i++)
			if(!prime[i] && sequence(i, i, N)) answer++; 

		System.out.print(answer);
	}
}