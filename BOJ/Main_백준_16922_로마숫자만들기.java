import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_16922_로마숫자만들기 {
	private static boolean[] visit;
	private static int value, cnt;
	private static final int[] num = { 1, 5, 10, 50 };

	public static void dfs(int start, int len, int N) {
		if(len == N) {
			if(!visit[value]) {
				visit[value] = true;
				cnt++;
			}
			
			return;
		}

		for(int i=start;i<4;i++) {
			value += num[i];

			dfs(i, len + 1, N);

			value -= num[i];
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		visit = new boolean[50 * 20 + 1];

		value = cnt = 0;
		for(int i=0;i<4;i++) {
			value += num[i];
			
			dfs(i, 1, N);
			
			value -= num[i];
		}

		System.out.print(cnt);
	}
}