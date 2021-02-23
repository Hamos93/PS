import java.util.Scanner;
import java.util.Stack;

public class Main_백준_9252_LCS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] s1 = sc.nextLine().toCharArray();
		char[] s2 = sc.nextLine().toCharArray();
	
		int[][] dp = new int[s1.length + 1][s2.length + 1];
		for(int i=1;i<=s1.length;i++) {
			for(int j=1;j<=s2.length;j++) {
				if(s1[i-1] == s2[j-1]) dp[i][j] = dp[i-1][j-1] + 1;
				else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
			}
		}
		
		Stack<Character> stack = new Stack<>();
		int i = s1.length;
		int j = s2.length;
		
		while(0 < i && 0 < j) {
			if(s1[i-1] == s2[j-1]) {
				stack.push(s1[i-1]);
				i--; j--;

				continue;
			}
			
			if(dp[i][j-1] < dp[i-1][j]) i--;
			else j--;
		}
		
		String LCS = "";
		while(!stack.isEmpty()) LCS += stack.pop();
		
		System.out.print(dp[s1.length][s2.length] + "\n" + LCS);
	}
}