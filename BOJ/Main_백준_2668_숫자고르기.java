import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2668_숫자고르기 {
	private static int last;
	private static int[] arr;
	private static boolean[] visit;
	private static List<Integer> list;
	
	public static void dfs(int x) {
		if(last == arr[x])
			list.add(last);
		
		if(!visit[arr[x]]) {
			visit[arr[x]] = true;
			dfs(arr[x]);
			visit[arr[x]] = false;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		arr = new int[N + 1];
		visit = new boolean[N + 1]; 
		
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		list = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			visit[i] = true;
			last = i;
	
			dfs(i);
			
			visit[i] = false;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(list.size() + "\n");
		
		for(int value : list)
			sb.append(value + "\n");
		
		System.out.print(sb.toString().trim());
	}
}