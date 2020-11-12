import java.util.Scanner;

public class Main_백준_1543_문서검색 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String document = sc.nextLine();
		String word = sc.nextLine();
	
		int cnt = 0;
		while(true) {
			int idx = document.indexOf(word);
		
			if(idx == -1)
				break;
			
			cnt++;
			document = document.substring(idx + word.length());
		}
		
		System.out.print(cnt);
	}
}