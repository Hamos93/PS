import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2839_설탕배달 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int result = Integer.MAX_VALUE;
		for(int i=1;i<=N;i++) {
			if(5 * i == N) {
				int total = i;
				result = total < result ? total : result;
			}

			for(int j=1;j<=N;j++) {
				if(3 * j == N) {
					int total = j;
					result = total < result ? total : result;
				}
				
				if(5 * i + 3 * j == N) {
					int total = i + j;
					result = total < result ? total : result;
				}
			}
		}
		
		if(result == Integer.MAX_VALUE) System.out.print("-1");
		else System.out.print(result);
	}
}
