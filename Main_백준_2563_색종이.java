import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2563_색종이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[][] paper = new int[101][101];
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int i=x;i<x+10;i++) {
				for(int j=y;j<y+10;j++)
					paper[i][j] = 1;
			}
		}
		
		int answer = 0;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=100;j++)
				if(paper[i][j] == 1) answer++;
		}
		
		System.out.print(answer);
	}
}