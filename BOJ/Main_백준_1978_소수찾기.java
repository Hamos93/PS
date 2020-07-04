import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1978_소수찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) continue;
			
			boolean flag = true;
			for(int i=2;i<=num/2;i++) {
				if(num % i == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) answer++;
		}
		
		System.out.print(answer);
	}
}