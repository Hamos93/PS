import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_4466_최대성적표만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
		
			int[] score = new int[N];
	
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				score[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(score);
			
			int answer = 0;
			for(int i=N-1;N-K<=i;i--)
				answer += score[i];
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}