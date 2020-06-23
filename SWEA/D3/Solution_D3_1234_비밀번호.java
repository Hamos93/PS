import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_1234_비밀번호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int len = Integer.parseInt(st.nextToken());
			String password = st.nextToken();
			
			List<Character> list = new ArrayList<>();
			for(int i=0;i<len;i++)
				list.add(password.charAt(i));
			
			for(int i=1;i<list.size();i++) {
				if(list.get(i - 1) == list.get(i)) {
					list.remove(i);
					list.remove(i - 1);
					
					i -= 2;
					
					if(i <= -1) i = 0;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			
			for(int i=0;i<list.size();i++)
				sb.append(list.get(i));
			
			System.out.println(sb.toString());
		}
	}
}