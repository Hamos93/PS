import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_백준_10809_알파벳찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		int[] alphabet = new int[26];
		Arrays.fill(alphabet, -1);
		
		for(int i=0;i<line.length();i++)
			if(alphabet[line.charAt(i) - 97] == -1) alphabet[line.charAt(i) - 97] = i;
		
		for(int i=0;i<26;i++)
			System.out.print(alphabet[i] + " ");
	}
}