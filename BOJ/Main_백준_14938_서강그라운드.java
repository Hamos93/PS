import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14938_서강그라운드 {
	private static final int INF = 100000;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int[] items = new int[n + 1];

		for(int i=1;i<=n;i++)
			items[i] = Integer.parseInt(st.nextToken());

		int[][] graph = new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				if(i != j) graph[i][j] = INF;
		}

		while(0 < r--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
		
			graph[a][b] = graph[b][a] = l;
		}
		
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]); 
		}
		
		int item = 0;
		for(int i=1;i<=n;i++) {
			int sum = 0;
			for(int j=1;j<=n;j++) {
				if(graph[i][j] <= m)
					sum += items[j];
			}
			
			item = item < sum ? sum : item;
		}
		
		System.out.print(item);
	}
}