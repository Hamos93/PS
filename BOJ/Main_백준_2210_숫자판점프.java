import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_2210_숫자판점프 {
	private static int[][] map;
	private static Set<String> hashSet;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static void dfs(int x, int y, List<String> list) {
		if(list.size() == 6) {
			StringBuilder sb = new StringBuilder();
			for(String str : list)
				sb.append(str);
			
			hashSet.add(sb.toString());
			return;
		}
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(0 <= nx && nx < 5 && 0 <= ny && ny < 5) {
				list.add(Integer.toString(map[nx][ny]));
				dfs(nx, ny, list);
				list.remove(list.size() - 1);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		map = new int[5][5];
		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<5;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		hashSet = new HashSet<>();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				List<String> list = new ArrayList<>();
				list.add(Integer.toString(map[i][j]));
				
				dfs(i, j, list);
			}
		}
	
		System.out.print(hashSet.size());
	}
}