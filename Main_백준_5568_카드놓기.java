package Backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_5568_카드놓기 {
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static Set<String> set;
	
	private static void permutation(int n, int r, int depth){
		if(depth == r){
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<r;i++)
				sb.append(res[i]);
			
			set.add(sb.toString());
			
			return;
		}
		
		for(int i=0;i<n;i++){
			if(!visit[i]){
				visit[i] = true;
				res[depth] = data[i];
				
				permutation(n, r, depth + 1);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int k = Integer.parseInt(st.nextToken());
		
		data = new int[n];
		res = new int[k];
		visit = new boolean[n];
		
		for(int i=0;i<n;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			data[i] = Integer.parseInt(st.nextToken()); 
		}
	
		Arrays.sort(data);
		
		set = new LinkedHashSet<>();
		permutation(n, k, 0);
		
		System.out.print(set.size());
	}
}