import java.util.Scanner;

public class Main_백준_1193_분수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		int line = 0, cnt = 0;
		while(true) {
			if(X <= (line + 1) + cnt) {
				line++;
				break;
			}

			line++;
			cnt += line;
		}

		int a = 0, b = 0 ;
		if(line % 2 == 0) { 
			a = 1; b = line; 
		
			while(++cnt < X) { a++; b--; }
		}else { 
			a = line; b = 1;
		
			while(++cnt < X) { a--; b++; }
		}
		
		System.out.print(a + "/" + b);
	}
}