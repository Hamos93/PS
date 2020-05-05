import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_9295_주사위 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++){
			st = new StringTokenizer(br.readLine(), " ");
			
			int res1 = Integer.parseInt(st.nextToken());
			int res2 = Integer.parseInt(st.nextToken());
		
			System.out.println("Case " + tc + ": " + (res1 + res2));
		}
	}
}