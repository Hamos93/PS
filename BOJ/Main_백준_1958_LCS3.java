import java.util.Scanner;

public class Main_백준_1958_LCS3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		String input3 = sc.nextLine();
	
		int len1 = input1.length(), len2 = input2.length(), len3 = input3.length();
		int[][][] dp = new int[len1 + 1][len2 + 1][len3 + 1];
		
		for(int i=1;i<=len1;i++) {
			for(int j=1;j<=len2;j++) {
				for(int k=1;k<=len3;k++) {
					if(input1.charAt(i-1) == input2.charAt(j-1) && input2.charAt(j-1) == input3.charAt(k-1)) dp[i][j][k] = dp[i-1][j-1][k-1] + 1;
					else dp[i][j][k] = Math.max(Math.max(dp[i][j-1][k], dp[i-1][j][k]), dp[i][j][k-1]);
				}
			}
		}
		
		System.out.print(dp[len1][len2][len3]);
	}
}