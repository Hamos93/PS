import java.util.Scanner;

public class Main_백준_2754_학점계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String score = sc.nextLine();
		
		if(score.equals("A+")) System.out.print("4.3");
		if(score.equals("A0")) System.out.print("4.0");
		if(score.equals("A-")) System.out.print("3.7");
		if(score.equals("B+")) System.out.print("3.3");
		if(score.equals("B0")) System.out.print("3.0");
		if(score.equals("B-")) System.out.print("2.7");
		if(score.equals("C+")) System.out.print("2.3");
		if(score.equals("C0")) System.out.print("2.0");
		if(score.equals("C-")) System.out.print("1.7");
		if(score.equals("D+")) System.out.print("1.3");
		if(score.equals("D0")) System.out.print("1.0");
		if(score.equals("D-")) System.out.print("0.7");
		if(score.equals("F")) System.out.print("0.0");
	}
}