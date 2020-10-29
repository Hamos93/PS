import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_10804_문자열의거울상 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String input = br.readLine();
			
			StringBuilder sb = new StringBuilder();
			sb.append(input);
			
			char[] mirror = sb.reverse().toString().toCharArray();
			for(int i=0;i<mirror.length;i++) {
				char ch = mirror[i];
				
				switch (ch) {
				case 'b':
					mirror[i] = 'd';
					break;
				case 'd':
					mirror[i] = 'b';
					break;
				case 'p':
					mirror[i] = 'q';
					break;
				case 'q':
					mirror[i] = 'p';
					break;
				}
			}
			
			System.out.print("#" + tc + " ");
			for(int i=0;i<mirror.length;i++)
				System.out.print(mirror[i]);
			
			System.out.println();
		}
	}
}