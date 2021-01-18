import java.util.Scanner;

public class Main_백준_11729_하노이탑이동순서 {
	private static int cnt;
	private static StringBuilder sb;
	
	private static void hanoiTower(int N, int from, int tmp, int to) {
		cnt++;
		
		if(N == 1) sb.append(from + " " + to + "\n");
		else {
			hanoiTower(N-1, from, to, tmp);
			sb.append(from + " " + to + "\n");
			hanoiTower(N-1, tmp, from, to);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		cnt = 0;
		sb = new StringBuilder();
		
		hanoiTower(N, 1, 2, 3);
		System.out.print(cnt + "\n" + sb.toString().trim());
	}
}