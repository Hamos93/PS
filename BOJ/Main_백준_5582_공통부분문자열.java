import java.util.Scanner;

public class Main_백준_5582_공통부분문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] str1 = sc.nextLine().toCharArray();
		char[] str2 = sc.nextLine().toCharArray();
		
		int[][] dp = new int[str1.length + 1][str2.length + 1];
		int LCS = 0;
		
		for(int i=1;i<=str1.length;i++) {
			for(int j=1;j<=str2.length;j++) {
				if(str1[i-1] == str2[j-1]) {
					dp[i][j] = dp[i-1][j-1] + 1;
					LCS = Math.max(LCS, dp[i][j]);
				}
			}
		}
		
		System.out.print(LCS);
	}
}