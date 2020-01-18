package Backtracking;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_15656_N과M7 {
	private static int[] data;
	private static int[] res;
	private static StringBuilder sb;
	
	private static void product(int n, int m, int depth){
		if(depth == m){
			for(int i=0;i<m;i++)
				sb.append(res[i] + " ");
			
			sb.append("\n");
			
			return;
		}
		
		for(int i=0;i<n;i++){
			res[depth] = data[i];
			product(n, m, depth + 1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		data = new int[N];
		res = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			data[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(data);
		
		sb = new StringBuilder();
		product(N, M, 0);

		System.out.print(sb.toString());
	}
}