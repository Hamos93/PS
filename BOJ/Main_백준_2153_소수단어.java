import java.util.Scanner;

public class Main_백준_2153_소수단어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] alphabet = sc.nextLine().toCharArray();
		
		int sum = 0;
		for(int i=0;i<alphabet.length;i++) {
			char ch = alphabet[i];
			
			if(97 <= ch && ch <= 122) sum += ch - 96;
			if(65 <= ch && ch <= 90) sum += ch - 38;
		}

		if(sum == 1) {
			System.out.print("It is a prime word.");
			return;
		}
		
		boolean flag = true;
		for(int i=2;i<=sum-1;i++) {
			if(sum % i == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag) System.out.print("It is a prime word.");
		else System.out.print("It is not a prime word.");
	}
}