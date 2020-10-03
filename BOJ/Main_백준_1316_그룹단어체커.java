import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1316_그룹단어체커 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		while(0 < N--) {
			char[] word = br.readLine().toCharArray();
			int[] alphabet = new int[26];
			alphabet[word[0] - 97]++;
			
			boolean flag = true;
			for(int i=1;i<word.length;i++) {
				if(1 <= alphabet[word[i] - 97] && word[i-1] != word[i]) {
					flag = false;
					break;
				}
				
				alphabet[word[i] - 97]++;
			}
			
			if(flag) cnt++;
		}
		
		System.out.print(cnt);
	}
}