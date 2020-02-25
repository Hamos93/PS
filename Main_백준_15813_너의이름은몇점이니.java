import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_15813_너의이름은몇점이니 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int len = Integer.parseInt(st.nextToken());
		String name = br.readLine().trim();
		
		int answer = 0;
		for(int i=0;i<len;i++)
			answer += name.charAt(i) - 64;
		
		System.out.print(answer);
	}
}