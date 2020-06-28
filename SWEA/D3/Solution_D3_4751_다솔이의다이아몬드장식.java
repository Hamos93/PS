import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_4751_다솔이의다이아몬드장식 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			String line = st.nextToken();
			int tempLen = line.length();

			if(tempLen == 1) line = "#." + line + ".#";
			else {
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<tempLen;i++) {
					sb.append(line.charAt(i));

					if(i < tempLen-1) sb.append(".#.");
				}
				
				line = sb.toString();
				line = "#." + line + ".#";
			}

			int len = line.length();
			char[][] decoration = new char[5][len];
			for(int j=0;j<len;j++)
				decoration[2][j] = line.charAt(j);
		
			for(int j=0;j<len;j++) {
				if(decoration[2][j] == '.') {
					decoration[1][j] = '#';
					decoration[3][j] = '#';
				}else {
					decoration[1][j] = '.';
					decoration[3][j] = '.';
				}
			}
			
			for(int j=0;j<len;j++) {
				if(('A' <= decoration[2][j] && decoration[2][j] <= 'Z') || ('a' <= decoration[2][j] && decoration[2][j] <= 'z')) {
					decoration[0][j] = '#';
					decoration[4][j] = '#';
				}else {
					decoration[0][j] = '.';
					decoration[4][j] = '.';
				}
			}
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<len;j++)
					System.out.print(decoration[i][j]);
				System.out.println();
			}
		}
	}
}