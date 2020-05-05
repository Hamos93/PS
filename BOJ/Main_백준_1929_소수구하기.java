import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1929_소수구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] prime = new boolean[N+1];
		prime[0] = prime[1] = true;
		
		for(int i=2;i<=N;i++){
			for(int j=i+i;j<=N;j+=i)
				prime[j] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=M;i<=N;i++)
			if(!prime[i]) sb.append(i + "\n");
		
		System.out.print(sb.toString());
	}
}