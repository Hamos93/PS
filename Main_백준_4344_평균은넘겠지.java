import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_4344_평균은넘겠지 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] student = new int[N];
			
			int sum = 0;
			for(int i=0;i<N;i++){
				student[i] = Integer.parseInt(st.nextToken());
				sum += student[i];
			}
			
			double avg = (double)sum / N;

			int cnt = 0;
			for(int i=0;i<N;i++)
				if(avg < student[i]) cnt++;
			
			double result = (double) cnt / N * 100;
			
			String answer = String.format("%.3f", result);
			System.out.println(answer + "%");
		}
	}
}