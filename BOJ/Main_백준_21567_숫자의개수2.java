import java.util.Scanner;

public class Main_백준_21567_숫자의개수2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();

		long result = A * B * C;
		String str = Long.toString(result);
		
		int[] digit = new int[10];
		for(int i=0;i<str.length();i++) {
			digit[str.charAt(i) - '0']++;
		}
		
		for(int cnt : digit)
			System.out.println(cnt);
	}
}