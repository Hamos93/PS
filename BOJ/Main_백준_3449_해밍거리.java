import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_3449_해밍거리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String str1 = br.readLine().trim();
			String str2 = br.readLine().trim();
		
			int len = str1.length(), cnt = 0;
			for(int i=0;i<len;i++)
				if(str1.charAt(i) != str2.charAt(i)) cnt++;

			System.out.println("Hamming distance is " + cnt + ".");
		}
	}
}