import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2512_예산 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int[] budget = new int[N];
		int totalBudget = 0, maxBudget = 0;

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			budget[i] = Integer.parseInt(st.nextToken());
			
			maxBudget = Math.max(budget[i], maxBudget);
			totalBudget += budget[i];
		}

		st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());

		if(totalBudget <= M) {
			System.out.print(maxBudget);
			return;
		}

		int low = 0, high = maxBudget;
		int limit = 0;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			long sum = 0;
			
			for(int i=0;i<N;i++)
				sum += Math.min(budget[i], mid);
			
			if(sum <= M) {
				limit = mid;
				low = mid + 1;
			}else high = mid - 1;
		}
		
		System.out.print(limit);
	}
}