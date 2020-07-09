import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2847_게임을만든동준이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] level = new int[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			level[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int i=N-1;0<i;i--) {
			if(level[i] <= level[i-1]) {
				answer += level[i-1] - level[i] + 1;
				level[i-1] = level[i] - 1;
			}
		}
		
		System.out.print(answer);
	}
}