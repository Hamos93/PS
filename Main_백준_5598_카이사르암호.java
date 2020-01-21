import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_5598_카이사르암호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] caesar = br.readLine().toCharArray();
		for(int i=0;i<caesar.length;i++){
			if(caesar[i] == 'A') caesar[i] = 'X';
			else if(caesar[i] == 'B') caesar[i] = 'Y';
			else if(caesar[i] == 'C') caesar[i] = 'Z';
			else caesar[i] -= 3;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<caesar.length;i++)
			sb.append(caesar[i]);
	
		System.out.print(sb.toString());
	}
}