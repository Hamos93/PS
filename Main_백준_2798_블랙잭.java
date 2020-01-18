import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2798_블랙잭 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] card = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			card[i] = Integer.parseInt(st.nextToken());

		int answer = 0;
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				for(int k=j+1;k<N;k++){
					int sum = card[i] + card[j] + card[k];
					
					if(answer < sum && sum <= M) answer = sum;
				}
			}
		}
		
		System.out.print(answer);
	}
}