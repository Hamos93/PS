import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_1933_간단한N의약수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=N;i++) {
			if(N % i == 0) sb.append(i + " ");
		}
		
		System.out.print(sb.toString().trim());
	}
}