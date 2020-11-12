import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1236_성지키기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		char[][] castle = new char[N][M];
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<M;j++)
				castle[i][j] = input.charAt(j);
		}
		
		int row = 0;
		for(int i=0;i<N;i++) {
			boolean flag = true;
			for(int j=0;j<M;j++)
				if(castle[i][j] == 'X') {
					flag = false;
					break;
				}
		
			if(flag) row++;
		}

		int col = 0;
		for(int j=0;j<M;j++) {
			boolean flag = true;
			for(int i=0;i<N;i++)
				if(castle[i][j] == 'X') {
					flag = false;
					break;
				}
		
			if(flag) col++;
		}

		int security = row <= col ? col : row;
		System.out.print(security);
	}
}