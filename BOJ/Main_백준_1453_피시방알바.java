import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1453_피시방알바 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		boolean[] visit = new boolean[101];

		int answer = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(N-- > 0){
			int computer = Integer.parseInt(st.nextToken());
			
			if(!visit[computer]) visit[computer] = true;
			else answer++;
		}
		
		System.out.print(answer);
	}
}