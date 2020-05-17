import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5356_의석이의세로로말해요 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			char[][] word = new char[5][15];

			for(int i=0;i<5;i++) {
				String line = br.readLine().trim();
				for(int j=0;j<line.length();j++)
					word[i][j] = line.charAt(j);
			}

			sb.append("#" + tc + " ");
			for(int j=0;j<15;j++) {
				for(int i=0;i<5;i++)
					if(word[i][j] != 0) sb.append(word[i][j]);
			}

			sb.append("\n");
		}

		System.out.print(sb.toString());
	}
}