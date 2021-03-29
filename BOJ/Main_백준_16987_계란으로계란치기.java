import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_16987_계란으로계란치기 {
	private static int N, egg;
	private static int[] durability;
	private static int[] weight;

	public static void dfs(int idx) {
		if(idx == N) {
			int cnt = 0;
			for(int i=0;i<N;i++) {
				if(durability[i] <= 0) cnt++;
			}
			
			egg = Math.max(egg, cnt);
			
			return;
		}
		
		if(durability[idx] <= 0) dfs(idx + 1);
		else {
			boolean flag = false;
			for(int i=0;i<N;i++) {
				if(i == idx || durability[i] <= 0) continue;
				
				flag = true;
				
				durability[idx] -= weight[i];
				durability[i] -= weight[idx];
				
				dfs(idx + 1);
				
				durability[idx] += weight[i];
				durability[i] += weight[idx];
			}
			
			if(!flag) dfs(N);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		
		durability = new int[N];
		weight = new int[N];

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int d = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
		
			durability[i] = d; weight[i] = w;
		}
		
		egg = 0;

		dfs(0);
	
		System.out.print(egg);
	}
}