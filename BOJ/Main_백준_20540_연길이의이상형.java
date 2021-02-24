import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_백준_20540_연길이의이상형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
	
		List<char[]> list = new ArrayList<>();
		list.add(new char[] { 'E', 'I' });
		list.add(new char[] { 'S', 'N' });
		list.add(new char[] { 'T', 'F' });
		list.add(new char[] { 'J', 'P' });
	
		String answer = "";
		for(int i=0;i<4;i++) {
			if(input[i] == list.get(i)[0]) answer += list.get(i)[1];
			else answer += list.get(i)[0];
		}
		
		System.out.print(answer);
	}
}