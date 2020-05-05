import java.util.Scanner;

public class Main_백준_2562_최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[9];
		int answer = 0;
		int idx = 0;
		for(int i=0;i<9;i++){
			array[i] = sc.nextInt();
			
			if(answer < array[i]){
				answer = array[i];
				idx = i;
			}
		}
		System.out.print(answer + "\n" + (idx + 1));
	}
}