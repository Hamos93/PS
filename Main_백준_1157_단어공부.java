import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1157_단어공부 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] visit = new int[26];
		String line = br.readLine();
		line = line.toUpperCase();
		
		int max = 0;
		for(int i=0;i<line.length();i++) {
			visit[line.charAt(i) - 65]++;
			
			if(max < visit[line.charAt(i) - 65]) max = visit[line.charAt(i) - 65];
		}

		int cnt = 0;
		for(int i=0;i<26;i++)
			if(max == visit[i]) cnt++;

		if(1 < cnt) System.out.print("?");
		else {
			for(int i=0;i<26;i++)
				if(max == visit[i]) System.out.print((char)(i + 65));
		}
	}
}