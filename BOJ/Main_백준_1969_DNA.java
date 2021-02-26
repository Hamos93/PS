import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_1969_DNA {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] DNA = new char[N][M];
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<M;j++)
				DNA[i][j] = input.charAt(j);
		}
		
		StringBuilder sb = new StringBuilder();
		int[] alphabet = new int[26];
		int distance = 0;
		
		for(int j=0;j<M;j++) {
			Arrays.fill(alphabet, 0);
			
			for(int i=0;i<N;i++) {
				char ch = DNA[i][j];
				alphabet[ch - 65]++;
			}
			
			char result = ' '; int max = 0;
			for(int k=0;k<26;k++) {
				if(max < alphabet[k]) {
					result = (char)(k + 65);
					max = alphabet[k];
				}
			}
			
			for(int i=0;i<N;i++) 
				if(result != DNA[i][j]) distance++;
		
			sb.append(result);
		}
		
		sb.append("\n" + distance);
		System.out.print(sb.toString().trim());
	}
}