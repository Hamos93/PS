import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2566_최댓값 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[][] map = new int[10][10];
		int answer = 0, r = 0, c = 0;
		
		for(int i=1;i<=9;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1;j<=9;j++){
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(answer < map[i][j]){
					answer = map[i][j];
					r = i;
					c = j;
				}
			}
		}
		
		System.out.print(answer + "\n" + r + " " + c);
	}
}