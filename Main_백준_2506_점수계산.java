import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2506_점수계산 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int answer = 0, cnt = 1;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()){
			int res = Integer.parseInt(st.nextToken());
			
			if(res == 1) {
				answer += cnt;
				cnt++;
			}
			
			if(res == 0) cnt = 1;
		}
		
		System.out.print(answer);
	}
}