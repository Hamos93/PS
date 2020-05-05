package DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11727_2xn타일링2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
	
		// d[i]: 2 * i 타일을 채우는 방법의 수
		int[] d = new int[n+1];
		d[0] = 1;
		d[1] = 1;
		
		for(int i=2;i<n+1;i++){
			d[i] = d[i-1] + 2 * d[i-2];
			d[i] %= 10007;
		}
		
		System.out.print(d[n]);
	}
}