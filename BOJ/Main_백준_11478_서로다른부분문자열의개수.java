import java.util.HashSet;
import java.util.Scanner;

public class Main_백준_11478_서로다른부분문자열의개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int len = S.length();
	
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(j + i + 1 <= len) {
					String word = S.substring(j, j + i + 1);
					
					if(!set.contains(word)) set.add(word);
				}
			}
		}
		
		System.out.print(set.size());
	}
}