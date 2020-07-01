import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3499_퍼펙트셔플 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			String[] arr = new String[N];

			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				arr[i] = st.nextToken();

			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			if(N % 2 == 0) {
				for(int i=0;i<N/2;i++)
					sb.append(arr[i] + " " + arr[i + N/2] + " ");
			}else {
				for(int i=0;i<N/2+1;i++) {
					if(i == N/2) sb.append(arr[i]);
					else sb.append(arr[i] + " " + arr[i + N/2 + 1] + " ");
				}
			}
			
			System.out.println(sb.toString().trim());
		}
	}
}