import java.util.Scanner;

public class Main_백준_2018_수들의합5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int i = 1, j = 2, cnt = 1;
		int sum = i + j;
		while(j < N) {
			if(sum < N) {
				j++;
				sum += j;
			}else if(N < sum){
				sum -= i;
				i++;
			}else {
				cnt++;

				j++;
				sum += j;
			}
		}
		
		System.out.print(cnt);
	}
}