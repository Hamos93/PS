import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5363_요다 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		while(0 < N--) {
			String[] input = br.readLine().split(" ");
			
			String word1 = input[0];
			String word2 = input[1];

			StringBuilder sb = new StringBuilder();
			for(int i=2;i<input.length;i++)
				sb.append(input[i] + " ");
			
			sb.append(word1 + " " + word2);
			
			System.out.println(sb.toString());
		}
	}
}