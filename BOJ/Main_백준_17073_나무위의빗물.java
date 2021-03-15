import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_17073_나무위의빗물 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		int[] tree = new int[N + 1];
		for(int i=1;i<=N-1;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			tree[u]++; tree[v]++;
		}
	
		int cnt = 0;
		for(int i=2;i<=N;i++)
			if(tree[i] == 1) 
				cnt++;
		
		double P = (double)(W) / cnt;
		System.out.print(String.format("%.10f", P));
	}
}