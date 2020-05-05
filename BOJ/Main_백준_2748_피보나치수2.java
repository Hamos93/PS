package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2748_피보나치수2 {
	private static long fibo(int n){
		long[] d = new long[n+1];
		d[0] = 0;
		d[1] = 1;
		
		for(int i=2;i<=n;i++)
			d[i] = d[i-1] + d[i-2];
		
		return d[n];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());

		System.out.print(fibo(N));
	}
}