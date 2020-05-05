import java.util.Scanner;

public class Solution_D1_2019_더블더블 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++) 
			sb.append((int)(Math.pow(2, i)) + " ");
		
		System.out.print(sb.toString().trim());
	}
}