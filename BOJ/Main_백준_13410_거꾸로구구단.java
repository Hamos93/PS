import java.util.Scanner;

public class Main_백준_13410_거꾸로구구단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		
		int max = 0;
		for(int i=1;i<=K;i++) {
			int value = N * i;
			sb.append(value);
			
			int result = Integer.parseInt(sb.reverse().toString());
			max = max < result ? result : max;
			
			sb.delete(0, sb.length());
		}
		
		System.out.print(max);
	}
}