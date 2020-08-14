import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D4_6719_성수의프로그래밍강좌신청 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[] lecture = new int[N];
	
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				lecture[i] = Integer.parseInt(st.nextToken());
		
			Arrays.sort(lecture);

			double A = 0.0;
			for(int i=N-K;i<N;i++) {
				A += lecture[i];
				A /= 2;
			}
			
			sb.append("#" + tc + " " + A + "\n");
		}
		
		System.out.print(sb.toString());
	}
}