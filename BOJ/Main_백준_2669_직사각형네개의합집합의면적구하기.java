import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2669_직사각형네개의합집합의면적구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[][] area = new int[101][101];
		for(int i=1;i<=4;i++) {
			st = new StringTokenizer(br.readLine(), " ");
		
			int x1 = Integer.parseInt(st.nextToken()); int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken()); int y2 = Integer.parseInt(st.nextToken());
		
			for(int x=x1;x<x2;x++) {
				for(int y=y1;y<y2;y++)
					area[x][y] = 1;
			}
		}
		
		int result = 0;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=100;j++)
				if(area[i][j] != 0) result++; 
		}
		
		System.out.print(result);
	}
}