import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5431_민석이의과제체크하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T= Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			boolean[] flag = new boolean[N + 1];

			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) flag[Integer.parseInt(st.nextToken())] = true;
			
			System.out.print("#" + tc + " ");
			for(int i=1;i<N+1;i++)
				if(!flag[i]) System.out.print(i + " ");
			System.out.println();
		}
	}
}