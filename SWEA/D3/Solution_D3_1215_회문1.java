import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1215_회문1 {
	private static final int N = 8;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int len = Integer.parseInt(st.nextToken());
			
			char[][] palindrome = new char[N][N];
			for(int i=0;i<N;i++) {
				String line = br.readLine().trim();
				for(int j=0;j<N;j++)
					palindrome[i][j] = line.charAt(j);
			}
			
			int answer = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(j + len <= N) {
						StringBuilder sb = new StringBuilder();
						for(int k=j;k<j+len;k++)
							sb.append(palindrome[i][k]);
	
						if(sb.toString().equals(sb.reverse().toString())) answer++;
					}
				}
			}
			
			for(int j=0;j<N;j++) {
				for(int i=0;i<N;i++) {
					if(i + len <= N) {
						StringBuilder sb = new StringBuilder();
						for(int k=i;k<i+len;k++)
							sb.append(palindrome[k][j]);
						
						if(sb.toString().equals(sb.reverse().toString())) answer++;
					}
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}