import java.util.Scanner;

public class Main_백준_1568_새 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int bird = 1, second = 0;
		while(N != 0) {
			if(N < bird) bird = 1;
			
			N -= bird;
			bird++;
			second++;
		}
		
		System.out.print(second);
	}
}