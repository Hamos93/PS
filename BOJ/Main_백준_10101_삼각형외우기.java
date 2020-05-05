import java.util.Scanner;

public class Main_백준_10101_삼각형외우기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] angle = new int[3];

		int sum = 0;
		for(int i=0;i<3;i++){
			angle[i] = sc.nextInt();
			sum += angle[i];
		}

		if(sum != 180) {
			System.out.print("Error");
			return;
		}

		if(angle[0] == angle[1] && angle[1] == angle[2] && angle[0] == angle[2]) System.out.print("Equilateral");
		else if((angle[0] != angle[1] && angle[1] != angle[2]) && angle[0] != angle[2]) System.out.print("Scalene");
		else System.out.print("Isosceles");
	}
}