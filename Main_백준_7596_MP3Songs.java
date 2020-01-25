import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_7596_MP3Songs {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int tc = 1;
		while(true){
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			if(N == 0) break;
			
			List<String> list = new ArrayList<>();
			
			while(N-- > 0){
				String line = br.readLine();
				
				list.add(line);
			}
			
			Collections.sort(list, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			});
			
			StringBuilder sb = new StringBuilder();
			sb.append(tc + "\n");
			
			for(int i=0;i<list.size();i++)
				sb.append(list.get(i) + "\n");
			
			System.out.print(sb.toString());
			
			tc++;
		}
	}
}