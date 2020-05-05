import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_6321_IBM빼기1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
	
		for(int tc=1;tc<=N;tc++){
			String computer = br.readLine().trim();

			sb.append("String #" + tc + "\n");
			
			for(int i=0;i<computer.length();i++){
				char ch = computer.charAt(i);
				
				if(ch == 'Z') sb.append("A");
				else sb.append((char)(ch + 1));
			}
			
			sb.append("\n\n");
		}
		
		System.out.print(sb.toString());
	}
}