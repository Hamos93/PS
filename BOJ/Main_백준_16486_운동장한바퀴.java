import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_16486_운동장한바퀴 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int d1 = Integer.parseInt(br.readLine());
		int d2 = Integer.parseInt(br.readLine());
		
		System.out.print((d1 * 2) + (2 * Math.PI * d2));
	}
}