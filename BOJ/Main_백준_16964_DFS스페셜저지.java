import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_백준_16964_DFS스페셜저지 {
	private static ArrayList<Integer>[] adjList;
	private static boolean[] visit;
	private static ArrayList<Integer> list;
	
	public static void dfs(int x) {
		visit[x] = true;
		list.add(x);
		
		for(int next : adjList[x]) {
			if(!visit[next]) {
				dfs(next);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		adjList = new ArrayList[N + 1];
		for(int i=1;i<=N;i++)
			adjList[i] = new ArrayList<>();
		
		for(int i=1;i<=N-1;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			adjList[u].add(v);
			adjList[v].add(u);
		}
		
		int[] input = new int[N + 1];
		int[] order = new int[N + 1];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=N;i++) {
			input[i] = Integer.parseInt(st.nextToken());
			order[input[i]] = i;
		}
		
		for(int i=1;i<=N;i++) {
			Collections.sort(adjList[i], new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					if(order[o1] < order[o2]) return -1;
					return 1;
				}
			});
		}
		
		visit = new boolean[N + 1];
		list = new ArrayList<>();
		
		dfs(1);
	
		boolean flag = true;
		list.add(0, 0);
		
		for(int i=1;i<=N;i++) {
			if(input[i] != list.get(i)) {
				flag = false;
				break;
			}
		}
	
		if(flag) System.out.print("1");
		else System.out.print("0");
	}
}