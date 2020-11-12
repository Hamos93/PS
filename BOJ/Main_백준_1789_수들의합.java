import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1789_수들의합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long S = Long.parseLong(st.nextToken());
		
		long sum = 0;
		int idx = 1, cnt = 0;
		while(true) {
			sum += idx++;
			cnt++;
			
			if(S < sum) {
				cnt--;
				
				break;
			}
		}

		System.out.print(cnt);
	}
}