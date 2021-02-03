import java.util.Scanner;

public class Main_백준_19944_뉴비의기준은뭘까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if(M == 1 || M == 2) System.out.print("NEWBIE!");
		else if(M <= N) System.out.print("OLDBIE!");
		else System.out.print("TLE!");
	}
}