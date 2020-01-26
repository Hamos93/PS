import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10179_쿠폰 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			double price = Double.parseDouble(st.nextToken());
			
			price *= 0.8;
			System.out.print("$");
			System.out.printf("%.2f", Math.round(price * 100) / 100.0);
			System.out.println();
		}
	}
}