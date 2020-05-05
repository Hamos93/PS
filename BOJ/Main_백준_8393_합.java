import java.util.Scanner;

public class Main_백준_8393_합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=n;i++)
			sum += i;
		
		System.out.print(sum);
	}
}