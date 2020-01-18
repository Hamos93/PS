package Backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_15655_N과M6 {
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static StringBuilder sb;
	
	private static void combination(int n, int m, int depth, int start){
		if(depth == m){
			for(int i=0;i<m;i++)
				sb.append(res[i] + " ");
			sb.append("\n");
			
			return;
		}
		
		for(int i=start;i<n;i++){
			if(!visit[i]){
				visit[i] = true;
				res[depth] = data[i];
				
				combination(n, m, depth + 1, i);
			
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		data = new int[N];
		res = new int[M];
		visit = new boolean[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			data[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(data);
		
		sb = new StringBuilder();
		combination(N, M, 0, 0);
	
		System.out.print(sb.toString());
	}
}
