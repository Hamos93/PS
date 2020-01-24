import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_10808_알파벳개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine().trim();
		
		int[] alphabet = new int[26];
		for(int i=0;i<S.length();i++)
			alphabet[S.charAt(i) - 97]++;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<26;i++)
			sb.append(alphabet[i] + " ");
		
		System.out.print(sb.toString());
	}
}