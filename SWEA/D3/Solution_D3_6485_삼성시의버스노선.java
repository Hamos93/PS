import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_6485_삼성시의버스노선 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			
			List<int[]> busLine = new ArrayList<>();
			while(0 < N--) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
			
				busLine.add(new int[] { A, B });
			}
			
			st = new StringTokenizer(br.readLine(), " ");
			
			int P = Integer.parseInt(st.nextToken());
			
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			while(0 < P--) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int no = Integer.parseInt(st.nextToken());
				
				int cnt = 0;
				for(int i=0;i<busLine.size();i++) {
					int start = busLine.get(i)[0];
					int destination = busLine.get(i)[1];
					
					if(start <= no && no <= destination) cnt++;
				}
				
				sb.append(cnt + " ");
			}
			
			System.out.println(sb.toString().trim());
		}
	}
}