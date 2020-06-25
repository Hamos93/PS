import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1159_농구경기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		char[] firstName = new char[26];
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			firstName[st.nextToken().charAt(0) - 97]++;
		}
		
		boolean flag = false;
		for(int i=0;i<26;i++) {
			if(5 <= firstName[i]) {
				flag = true;
				System.out.print((char)(i + 97));
			}
		}
		
		if(!flag) System.out.print("PREDAJA");
	}
}