import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_4458_첫글자를대문자로 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		while(N-- > 0){
			char[] line = br.readLine().trim().toCharArray();
			
			char ch = line[0];
			if(97 <= ch && ch <=122) ch -= 32;

			line[0] = ch;
		
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<line.length;i++)
				sb.append(line[i]);
			sb.append("\n");
			
			System.out.print(sb.toString());
		}
	}
}