package Backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_10819_차이를최대로 {
	private static int[] A;
	private static int[] res;
	private static boolean[] visit;
	private static int answer;
	
	private static void permutation(int n, int m, int depth){
		if(depth == m){
			int sum = 0;
			for(int i=1;i<m;i++)
				sum += Math.abs(res[i-1] - res[i]);
		
			answer = answer < sum ? sum : answer;
		}
		
		for(int i=0;i<n;i++){
			if(!visit[i]){
				visit[i] = true;
				res[depth] = A[i];
				
				permutation(n, m, depth + 1);

				visit[i] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());

		A = new int[N];
		res = new int[N];
		visit = new boolean[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(A);
		
		answer = 0;
		permutation(N, N, 0);
		
		System.out.print(answer);
	}
}