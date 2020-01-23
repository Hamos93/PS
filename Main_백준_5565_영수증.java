import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5565_영수증 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int price = Integer.parseInt(st.nextToken());
		for(int i=1;i<=9;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			price -= Integer.parseInt(st.nextToken());
		}
		
		System.out.print(price);
	}
}