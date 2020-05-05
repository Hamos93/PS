import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10178_할로윈의사탕 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int candy = Integer.parseInt(st.nextToken());
			int bro = Integer.parseInt(st.nextToken());
			
			System.out.println("You get " + (candy/bro) + " piece(s) and your dad gets " + (candy%bro) + " piece(s).");
		}
	}
}