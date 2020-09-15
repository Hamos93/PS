import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1032_명령프롬프트 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		String[] file = new String[N];
		
		for(int i=0;i<N;i++)
			file[i] = br.readLine().trim();
		
		if(N == 1) {
			System.out.print(file[0]);
			
			return;
		}
		
		int len = file[0].length();
		String pattern = "";
		for(int i=0;i<len;i++) {
			char ch = file[0].charAt(i);
			boolean flag = true;
			
			for(int j=1;j<N;j++) {
				if(ch != file[j].charAt(i)) {
					flag = false;
					break;
				}
			}
			
			if(flag) pattern += ch;
			else pattern += "?";
		}
		
		System.out.print(pattern);
	}
}