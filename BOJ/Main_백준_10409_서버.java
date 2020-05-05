import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10409_서버 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		int[] task = new int[n];
		int time = 0, answer = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++) {
			task[i] = Integer.parseInt(st.nextToken());
			
			if(task[i] + time <= T) {
				time += task[i];
				answer++;
			}else break;
		}
		
		System.out.print(answer);
	}
}