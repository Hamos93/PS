import java.util.Scanner;

public class Main_백준_13325_팰린드롬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		StringBuilder sb = new StringBuilder(word);
		
		if(sb.toString().equals(sb.reverse().toString())) System.out.print("true");
		else System.out.print("false");
	}
}