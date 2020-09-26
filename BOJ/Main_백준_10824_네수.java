import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_10824_네수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split(" ");
		String num1 = arr[0] + arr[1];
		String num2 = arr[2] + arr[3];
		
		System.out.println(Long.parseLong(num1) + Long.parseLong(num2));
	}
}