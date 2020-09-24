import java.util.Scanner;

public class Main_백준_10162_전자레인지 {
	public static void main(String[] args) {
		int[] time = { 300, 60, 10 };
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		if(T % time[2] != 0) {
			System.out.print("-1");
			return;
		}
		
		int[] answer = new int[3]; int idx = 0;
		while(true) {
			if(T == 0) break;
			
			int cnt = T / time[idx];
			T -= cnt * time[idx];
			
			answer[idx++] = cnt;
		}
		
		System.out.print(answer[0] + " " + answer[1] + " " + answer[2]);
	}
}