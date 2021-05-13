import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_백준_3059_등장하지않는문자의합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		while(0 < T--) {
			char[] S = br.readLine().trim().toCharArray();
			boolean[] alphabet = new boolean[26];
			
			for(char ch : S)
				alphabet[ch - 65] = true;
		
			int sum = 0;
			for(int i=0;i<26;i++) {
				if(!alphabet[i])
					sum += (i + 65);
			}
			
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}