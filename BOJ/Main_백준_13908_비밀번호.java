import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13908_비밀번호 {
	private static int n, m;
	private static int cnt;
	private static int[] data;
	private static int[] visit;
	
	public static void dfs(int len) {
		if(len == n) {
			boolean flag = true;
			for(int i=0;i<m;i++) {
				if(visit[data[i]] == 0){
					flag = false;
					break;
				}
			}
			
			if(flag) cnt++;
			
			return;
		}
		
		for(int i=0;i<=9;i++) {
			visit[i]++;
			
			dfs(len + 1);
			
			visit[i]--;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		data = new int[m];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<m;i++)
			data[i] = Integer.parseInt(st.nextToken());
		
		visit = new int[10];
		cnt = 0;
		
		dfs(0);

		System.out.print(cnt);
	}
}