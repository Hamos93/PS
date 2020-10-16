import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_15686_치킨배달 {
	private static int N, M, distance;
	private static int[][] map;
	private static int[] posX;
	private static int[] posY;
	private static int[] resX;
	private static int[] resY;
	private static boolean[] visit;

	private static void combination(int S, int M, int depth, int start, List<int[]> house) {
		if(depth == M) {
			int sum = 0;
			for(int i=0;i<house.size();i++) {
				int houseX = house.get(i)[0];
				int houseY = house.get(i)[1];

				int value = Integer.MAX_VALUE;
				for(int j=0;j<M;j++) {
					int chickenX = resX[j];
					int chickenY = resY[j];
				
					int result = Math.abs(houseX - chickenX) + Math.abs(houseY - chickenY);
					value = result < value ? result : value;
				}
				
				sum += value;
			}
			
			distance = sum < distance ? sum : distance;
			
			return;
		}
		
		for(int i=start;i<S;i++) {
			if(!visit[i]) {
				visit[i] = true;
				resX[depth] = posX[i];
				resY[depth] = posY[i];
				
				combination(S, M, depth + 1, i, house);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][N+1];
		
		List<int[]> house = new ArrayList<>();
		List<int[]> chicken = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1;j<=N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(map[i][j] == 1) house.add(new int[] { i, j });
				if(map[i][j] == 2) chicken.add(new int[] { i, j });
			}
		}
		
		int size = chicken.size();

		posX = new int[size]; posY = new int[size];
		for(int i=0;i<chicken.size();i++) {
			int x = chicken.get(i)[0];
			int y = chicken.get(i)[1];
			
			posX[i] = x; posY[i] = y;
		}
		
		resX = new int[M]; resY = new int[M];
		visit = new boolean[size];
		
		distance = Integer.MAX_VALUE;
		combination(size, M, 0, 0, house);
	
		System.out.print(distance);
	}
}