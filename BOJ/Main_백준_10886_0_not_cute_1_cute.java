import java.util.Scanner;

public class Main_백준_10886_0_not_cute_1_cute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int zeroCnt = 0;
		int oneCnt = 0;
		
		while(N-- > 0) {
			int value = sc.nextInt();
			
			if(value == 0) zeroCnt++;
			else oneCnt++;
		}
		
		if(zeroCnt < oneCnt) System.out.print("Junhee is cute!");
		else System.out.print("Junhee is not cute!");
	}
}