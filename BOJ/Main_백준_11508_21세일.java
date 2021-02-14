import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_11508_21세일 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] price = new int[N + 1];
		
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(price);
		
		int result = 0, cnt = 1;
		for(int i=N;1<=i;i--) {
			if(cnt == 3) {
				cnt = 1;
				continue;
			}
			
			result += price[i];
			cnt++;
		}

		System.out.print(result);
	}
}