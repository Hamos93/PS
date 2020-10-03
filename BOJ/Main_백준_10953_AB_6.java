import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10953_AB_6 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			String[] num = br.readLine().split(",");
			
			System.out.println(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));
		}
	}
}