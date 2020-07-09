import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2799_블라인드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		char[][] apartment = new char[5 * M + 1][5 * N + 1];
		for(int i=0;i<5*M + 1;i++) {
			String line = br.readLine();
			for(int j=0;j<5*N + 1;j++)
				apartment[i][j] = line.charAt(j);
		}

		int[] blind = new int[5];
		for(int i=1;i<5*M + 1;i+=5) {
			for(int j=1;j<5*N + 1;j+=5) {
				if(apartment[i][j] == '*') {
					int cnt = 0, k = i;
					
					while(apartment[k++][j] == '*') cnt++;
					blind[cnt]++;
				}else blind[0]++;
			}
		}
		
		for(int i=0;i<5;i++) {
			if(i == 4) System.out.print(blind[i]);
			else System.out.print(blind[i] + " ");
		}
	}
}