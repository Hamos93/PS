import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1204_최빈수구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) { 
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			
			int[] score = new int[101];
			st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) score[Integer.parseInt(st.nextToken())]++;
		
			int maxScore = 0;
			int mode = 0;
			
			for(int i=100;0<=i;i--) {
				if(maxScore < score[i]) {
					maxScore = score[i];
					mode = i;
				}
			}
			
			sb.append("#" + n + " " + mode + "\n");
		}
		
		System.out.print(sb.toString());
	}
}