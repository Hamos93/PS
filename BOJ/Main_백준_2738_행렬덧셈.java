import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2738_행렬덧셈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][M];
		for(int k=0;k<2;k++){
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<M;j++)
					arr[i][j] += Integer.parseInt(st.nextToken());
			}
		}

		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
}