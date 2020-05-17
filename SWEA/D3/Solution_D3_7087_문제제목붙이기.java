import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7087_문제제목붙이기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			char[] alphabet = new char[26];

			int N = Integer.parseInt(st.nextToken());
			for(int n=0;n<N;n++) {
				st = new StringTokenizer(br.readLine(), " ");

				char ch = st.nextToken().charAt(0);
				alphabet[(int)(ch - 65)]++;
			}

			int answer = 0;
			for(int i=0;i<26;i++) {
				if(alphabet[i] == 0) break;
				else answer++;
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}