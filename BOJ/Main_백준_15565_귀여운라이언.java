import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_15565_귀여운라이언 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] dolls = new int[1000000];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			dolls[i] = Integer.parseInt(st.nextToken());

		if(N == 1 && dolls[0] == 1) {
			System.out.print("1");
			return;
		}
		
		int start = 0, end = 1, lion = 0, result = Integer.MAX_VALUE;
		
		if(dolls[start] == 1) lion++;
		if(dolls[end] == 1) lion++;
		
		while(true) {
			if(lion < K) {
				end++;
				
				if(N <= end) 
					break;
				
				if(dolls[end] == 1) lion++;
			}else {
				result = Math.min(result, end - start + 1);

				if(dolls[start] == 1)
					lion--;

				start++;
			}
		}

		if(result == Integer.MAX_VALUE) System.out.print("-1");
		else System.out.print(result);
	}
}