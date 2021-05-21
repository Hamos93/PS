import java.util.Scanner;

public class Solution_D3_12004_구구단1 {
	public static void main(String[] args) {
		boolean[] num = new boolean[101];
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++)
				num[i*j] = true;
		}
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			
			if(num[N]) sb.append("#" + tc + " Yes\n");
			else sb.append("#" + tc + " No\n");
		}

		System.out.print(sb.toString().trim());
	}
}