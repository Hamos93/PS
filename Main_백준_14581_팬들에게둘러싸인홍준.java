import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_14581_팬들에게둘러싸인홍준 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String id = br.readLine().trim();
		
		System.out.println(":fan::fan::fan:");
		System.out.println(":fan::" + id + "::fan:");
		System.out.println(":fan::fan::fan:");
	}
}