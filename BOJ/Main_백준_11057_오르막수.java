package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11057_오르막수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		// d[N][L]: 길이가 N이면서 마지막 숫자가 L인 오르막 수의 개수
		// d[N][L] += d[N-1][0 ~ L] 
		long[][] d = new long[N+1][10];
		int mod = 10007;

		for(int i=0;i<=9;i++) d[1][i] = 1;
		for(int i=2;i<N+1;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=j;k++){
					d[i][j] += d[i-1][k];

					d[i][j] %= mod;
				}
			}
		}

		long answer = 0;
		for(int i=0;i<=9;i++) answer += d[N][i];
		answer %= mod;

		System.out.print(answer);
	}
}