package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2606_바이러스 {
	private static int computer;
	private static int[][] network;
	private static boolean[] virus;
	
	private static void dfs(int node){
		virus[node] = true;
		
		for(int next=1;next<computer+1;next++){
			if(!virus[next] && network[node][next] == 1) dfs(next);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		computer = Integer.parseInt(st.nextToken());
		network = new int[computer + 1][computer + 1];
		virus = new boolean[computer + 1];
		
		st = new StringTokenizer(br.readLine(), " ");
		int connect = Integer.parseInt(st.nextToken());
		
		while(connect-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
		
			network[i][j] = network[j][i] = 1;
		}
		
		dfs(1);
		
		int answer = 0;
		for(int i=2;i<computer+1;i++)
			if(virus[i]) answer++;
		
		System.out.print(answer);
	}
}