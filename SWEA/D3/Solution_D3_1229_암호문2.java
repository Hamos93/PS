import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_1229_암호문2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			List<String> cryptogram = new ArrayList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) cryptogram.add(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			int cnt = Integer.parseInt(st.nextToken());
		
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				String command = st.nextToken();
				
				if(command.charAt(0) == 'I') {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
				
					while(0 < y--) cryptogram.add(x++, st.nextToken());
				}else {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
				
					while(0 < y--) cryptogram.remove(x);
				}
			}
		
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			
			for(int i=0;i<10;i++) {
				if(i == 9) sb.append(cryptogram.get(i));
				else sb.append(cryptogram.get(i) + " ");
			}
			
			System.out.println(sb.toString());
		}
	}
}