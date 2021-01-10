import java.util.Scanner;

public class Main_백준_9659_돌게임5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		if(N % 2 == 1) System.out.print("SK");
		else System.out.print("CY");
	}
}