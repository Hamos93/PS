import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D2_1983_조교의성적매기기 {
	private static String[] GRADE = { "A+", "A0", "A-", "B+", "B0", "B-","C+", "C0", "C-", "D0"};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
		
			double[] score = new double[N];
			double value = 0.0;
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				score[i] = (Integer.parseInt(st.nextToken()) * 0.35) + (Integer.parseInt(st.nextToken()) * 0.45) + (Integer.parseInt(st.nextToken()) * 0.2);
			
				if(i == K-1) value = score[i]; 
			}
			
			Arrays.sort(score);
			
			int idx = 0, cnt = 0;
			for(int i=N-1;0<=i;i--) {
				if(value == score[i]) break;
				cnt++;
				if(cnt == N/10) {
					cnt = 0;
					idx++;
				}
			}
			
			System.out.println("#" + tc + " " + GRADE[idx]);
		}
	}
}