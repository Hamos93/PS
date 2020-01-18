package Backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2303_숫자게임 {
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static int value, answer;
	
	private static void permutation(int n, int r, int depth, int idx){
		if(depth == r){
			int sum = 0;
			for(int i=0;i<r;i++)
				sum += res[i];
			
			String tmp = Integer.toString(sum);
			int num = tmp.charAt(tmp.length() - 1) - '0';
			
			if(value <= num){
				value = num;
				answer = idx;
			}
			
			return;
		}
		
		for(int i=0;i<n;i++){
			if(!visit[i]){
				visit[i] = true;
				res[depth] = data[i];
				
				permutation(n, r, depth + 1, idx);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		value = 0;
		answer = 0;
		
		for(int i=1;i<=N;i++){
			data = new int[5];
			res = new int[3];
			visit = new boolean[5];

			st = new StringTokenizer(br.readLine(), " ");
			for(int k=0;k<5;k++)
				data[k] = Integer.parseInt(st.nextToken());

			permutation(5, 3, 0, i);
		}
		
		System.out.print(answer);
	}
}