package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2163_초콜릿자르기 {
	public static void main(String[] args) throws Exception	 {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[][] d = new int[301][301];
		for(int i=1;i<301;i++) d[1][i] = i-1;
		for(int i=2;i<301;i++){
			for(int j=1;j<301;j++){
				if(j == 1) d[i][j] = i-1;
				else d[i][j] = d[i][j-1] + i;
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		System.out.println(d[N][M]);
	}
}