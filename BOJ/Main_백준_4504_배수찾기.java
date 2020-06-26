import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_4504_배수찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int num = Integer.parseInt(st.nextToken());
			if(num == 0) return;
			
			if(num < n || num % n != 0) System.out.println(num + " is NOT a multiple of " + n + ".");
			else if(num % n == 0) System.out.println(num + " is a multiple of " + n + ".");
		}
	}
}