import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5603_건초더미 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] hay = new int[N];
			int total = 0;

			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				hay[i] = Integer.parseInt(st.nextToken());
				total += hay[i];
			}
			
			int standard = total / N, answer = 0;
			for(int i=0;i<N;i++)
				if(hay[i] < standard) answer += standard - hay[i];
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}