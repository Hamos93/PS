import java.util.Arrays;
import java.util.Scanner;

public class Main_백준_1342_행운의문자열 {
	private static char[] data;
	private static int cnt;
	
	public static boolean check(String str) {
		for(int i=1;i<str.length();i++)
			if(str.charAt(i-1) == str.charAt(i)) return false;
		
		return true;
	}
	
	public static void swap(int i, int j) {
		char temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	public static boolean nextPermutation(int n) {
		int i = n - 1;
		while(0 < i && data[i] <= data[i-1]) i--;
		if(i <= 0) return false; 

		int j = n - 1;
		while(data[j] <= data[i-1]) j--;

		swap(i-1, j);

		j = n - 1;
		while(i < j) {
			swap(i, j);
			i++; j--;
		}

		return true;
	}		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		data = S.toCharArray();
		
		int len = data.length;
		
		Arrays.sort(data);

		cnt = 0;
		while(true) {
			String str = "";
			for(char ch : data)
				str += ch;

			if(check(str)) cnt++;
			
			if(!nextPermutation(len)) break;				
		}
		
		System.out.print(cnt);
	}
}