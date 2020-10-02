import java.util.Scanner;

public class Main_백준_11719_그대로출력하기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		sc.close();
	}
}