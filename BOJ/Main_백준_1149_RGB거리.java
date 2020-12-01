import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1149_RGB거리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[][] RGB = new int[N][3];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<3;j++)
				RGB[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1;i<N;i++) {
			for(int j=0;j<3;j++) {
				int min = Integer.MAX_VALUE;
				for(int k=0;k<3;k++) {
					if(j == k) continue;
					min = RGB[i-1][k] < min ? RGB[i-1][k] : min;
				}
				
				RGB[i][j] += min;
			}
		}

		int result = RGB[N-1][0];
		for(int j=1;j<3;j++)
			result = RGB[N-1][j] < result ? RGB[N-1][j] : result;
		
		System.out.print(result);
	}
}