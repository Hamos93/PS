import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_9093_단어뒤집기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String[] word = br.readLine().trim().split(" ");
			
			StringBuilder sb1 = null;
			StringBuilder sb2 = new StringBuilder();
			
			for(int i=0;i<word.length;i++) {
				sb1 = new StringBuilder();
				
				sb1.append(word[i]);
				word[i] = sb1.reverse().toString();
				
				sb2.append(word[i] + " ");
			}
			
			System.out.println(sb2.toString().trim());
		}
	}
}