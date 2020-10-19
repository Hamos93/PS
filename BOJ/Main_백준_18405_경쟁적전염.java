import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_18405_경쟁적전염 {
	private static int N;
	private static int[][] map;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static boolean isRange(int x, int y) {
		if(1 <= x && x <= N && 1 <= y && y <= N) return true;
		else return false;
	}
	
	private static int bfs(List<int[]> list, int S, int X, int Y) {
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i=0;i<list.size();i++) {
			int x = list.get(i)[0];
			int y = list.get(i)[1];
		
			queue.offer(new int[] { x, y, 0 });
		}
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0];
			int y = poll[1];
			int s = poll[2];
			
			if(s == S) return map[X][Y];
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(isRange(nx, ny) && map[nx][ny] == 0) {
					map[nx][ny] = map[x][y];
					
					queue.offer(new int[] { nx, ny, s + 1 });
				}
			}
		}
		
		return map[X][Y];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		map = new int[N + 1][N + 1];
		List<int[]> list = new ArrayList<>();
		
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1;j<=N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
	
				if(map[i][j] != 0) list.add(new int[] { i, j, map[i][j] });
			}
		}
	
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[2] > o2[2]) return 1;
				return -1;
			}
		});
		
		st = new StringTokenizer(br.readLine(), " ");
		int S = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		if(S == 0) System.out.print(map[X][Y]);
		else System.out.print(bfs(list, S, X, Y));
	}
}