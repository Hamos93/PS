import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_2007_패턴마디의길이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String line = br.readLine().trim();
			
			for(int i=1;i<=10;i++) {
				StringBuilder sb = new StringBuilder();
				int len = line.length();
				
				// 길이 1 ~ 10까지의 패턴만들기
				for(int j=0;j<i;j++)
					sb.append(line.charAt(j));

				String pattern = sb.toString();
				int pLen = pattern.length();
				int cnt = 0;
				
				// 생성된 패턴을 전체 문자열과 비교
				for(int k=0;k<len;k+=pLen) {
					if(k + pLen <= 30 && line.substring(k, k + pLen).equals(pattern)) cnt++;
					else break;
				}
				
				if((len/pLen) == cnt) {
					System.out.println("#" + tc + " " + pLen);
					break;
				}
			}
		}
	}
}