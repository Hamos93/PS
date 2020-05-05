import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_14500_테트로미노 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] map = new int[N][M];
		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		int answer = 0;
		for(int i=0;i<=N-1;i++){
			for(int j=0;j<=M-4;j++){
				int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i][j+3];

				answer = answer < sum ? sum : answer; 
			}
		}

		for(int i=0;i<=N-4;i++){
			for(int j=0;j<=M-1;j++){
				int sum = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+3][j];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-2;i++){
			for(int j=0;j<=M-2;j++){
				int sum = map[i][j] + map[i][j+1] + map[i+1][j] + map[i+1][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-3;i++){
			for(int j=0;j<=M-2;j++){
				int sum = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+2][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-3;i++){
			for(int j=0;j<=M-2;j++){
				int sum = map[i+2][j] + map[i+2][j+1] + map[i+1][j+1] + map[i][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-2;i++){
			for(int j=0;j<=M-3;j++){
				int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-2;i++){
			for(int j=0;j<=M-3;j++){
				int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j+2];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-2;i++){
			for(int j=0;j<=M-3;j++){
				int sum = map[i+1][j] + map[i+1][j+1] + map[i+1][j+2] + map[i][j+2];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-2;i++){
			for(int j=0;j<=M-3;j++){
				int sum = map[i][j] + map[i+1][j] + map[i+1][j+1] + map[i+1][j+2];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-3;i++){
			for(int j=0;j<=M-2;j++){
				int sum = map[i][j] + map[i][j+1] + map[i+1][j+1] + map[i+2][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-3;i++){
			for(int j=0;j<=M-2;j++){
				int sum = map[i][j] + map[i+1][j] + map[i+2][j] + map[i][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-3;i++){
			for(int j=0;j<=M-2;j++){
				int sum = map[i][j] + map[i+1][j] + map[i+1][j+1] + map[i+2][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-3;i++){
			for(int j=0;j<=M-2;j++){
				int sum = map[i+1][j] + map[i+2][j] + map[i+1][j+1] + map[i][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-2;i++){
			for(int j=0;j<=M-3;j++){
				int sum = map[i+1][j] + map[i+1][j+1] + map[i][j+1] + map[i][j+2];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-2;i++){
			for(int j=0;j<=M-3;j++){
				int sum = map[i][j] + map[i][j+1] + map[i+1][j+1] + map[i+1][j+2];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-2;i++){
			for(int j=0;j<=M-3;j++){
				int sum = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-2;i++){
			for(int j=0;j<=M-3;j++){
				int sum = map[i+1][j] + map[i+1][j+1] + map[i][j+1] + map[i+1][j+2];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-3;i++){
			for(int j=0;j<=M-2;j++){
				int sum = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+1][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		for(int i=0;i<=N-3;i++){
			for(int j=0;j<=M-2;j++){
				int sum = map[i+1][j] + map[i][j+1] + map[i+1][j+1] + map[i+2][j+1];

				answer = answer < sum ? sum : answer; 
			}
		}
		
		System.out.print(answer);
	}
}