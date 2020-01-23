import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5543_상근날드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] menu = new int[5];

		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			menu[i] = Integer.parseInt(st.nextToken());
		}

		int answer = Integer.MAX_VALUE;
		for(int i=0;i<=2;i++) {
			for(int j=3;j<=4;j++) {
				int result = 0;
				result = menu[i] + menu[j] - 50;
		
				answer = result < answer ? result : answer;
			}
		}
		
		System.out.print(answer);
	}
}