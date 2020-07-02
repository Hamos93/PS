import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1216_회문2 {
	private static final int N = 100;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int t = Integer.parseInt(st.nextToken());
			
			char[][] palindrome = new char[N][N];
			for(int i=0;i<N;i++) {
				String line = br.readLine().trim();
				for(int j=0;j<N;j++)
					palindrome[i][j] = line.charAt(j);
			}
			
			int answer = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					for(int k=99;0<=k;k--) {
						if(palindrome[i][j] == palindrome[i][k]) {
							StringBuilder sb = new StringBuilder();
							
							for(int c=j;c<=k;c++)
								sb.append(palindrome[i][c]);
							
							if(sb.toString().equals(sb.reverse().toString()))
								answer = answer < sb.toString().length() ? sb.toString().length() : answer;
						}
					}
				}
			}
		
			for(int j=0;j<N;j++) {
				for(int i=0;i<N;i++) {
					for(int k=99;0<=k;k--) {
						if(palindrome[i][j] == palindrome[k][j]) {
							StringBuilder sb = new StringBuilder();
							
							for(int c=i;c<=k;c++)
								sb.append(palindrome[c][j]);
							
							if(sb.toString().equals(sb.reverse().toString()))
								answer = answer < sb.toString().length() ? sb.toString().length() : answer;
						}
					}
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}