package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10844_쉬운계단수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		long mod = 1000000000;

		// d[N][L]: 길이가 N이면서 마지막 숫자가 L로 계단 수의 개수
		// d[N][L] = d[N-1][L-1] + d[N-1][L+1]
		long[][] d = new long[N+1][10];
	
		// 길이가 1인 계단 수의 개수
		for(int i=1;i<=9;i++) d[1][i] = 1;
		
		// 길이 2 이상 N이하의 계단 수의 개수
		for(int i=2;i<N+1;i++){
			for(int j=0;j<=9;j++){
				if(0 <= j-1) d[i][j] += d[i-1][j-1];
				if(j+1 <= 9) d[i][j] += d[i-1][j+1];
				
				d[i][j] %= mod;
			}
		}
	
		long answer = 0;
		for(int i=0;i<=9;i++) answer += d[N][i];
		answer %= mod;
		
		System.out.print(answer);
	}
}