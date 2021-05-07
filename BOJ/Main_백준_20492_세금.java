import java.util.Scanner;

public class Main_백준_20492_세금 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.print((int)(N * 0.78) + " " + ((int)(N * 0.8) + (int)(N * 0.2 * 0.78)));
	}
}