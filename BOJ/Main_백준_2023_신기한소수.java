import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2023_신기한소수 {
	private static StringBuilder sb;
	
	public static void dfs(String x, int N) {
		int value = Integer.parseInt(x);
		
		boolean flag = true;
		for(int i=2;i<=value-1;i++) {
			if(value % i == 0) {
				flag = false;
				break;
			}
		}
		
		if(!flag) return;
		
		if(x.length() == N) {
			sb.append(x + "\n");
			return;
		}
		
		for(int next=1;next<=9;next++) {
			x += Integer.toString(next);
			
			dfs(x, N);
			
			x = x.substring(0, x.length() - 1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = { 2, 3, 5, 7 };
		
		sb = new StringBuilder();
		for(int i=0;i<4;i++)
			dfs(Integer.toString(arr[i]), N);
		
		System.out.print(sb.toString().trim());
	}
}