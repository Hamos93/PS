import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2669_직사각형네개의합집합의면적구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[][] map = new int[101][101];
		int input = 4;
		
		while(input-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken()); 
			int y1 = Integer.parseInt(st.nextToken()); 
			int x2 = Integer.parseInt(st.nextToken()); 
			int y2 = Integer.parseInt(st.nextToken()); 
		
			for(int i=x1;i<x2;i++){
				for(int j=y1;j<y2;j++)
					map[i][j] = 1;
			}
		}
		
		int area = 0;
		for(int i=1;i<=100;i++){
			for(int j=1;j<=100;j++)
				if(map[i][j] == 1) area++;
		}
		
		System.out.print(area);
	}
}