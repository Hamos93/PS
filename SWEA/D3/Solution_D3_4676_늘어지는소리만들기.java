import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_4676_늘어지는소리만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String line = br.readLine().trim();

			List<Character> list = new ArrayList<>();
			for(int i=0;i<line.length();i++)
				list.add(line.charAt(i));

			int len = list.size();
			st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());

			int[] hyphen = new int[len + 1];

			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) hyphen[Integer.parseInt(st.nextToken())]++;

			for(int i=len;0<=i;i--) {
				if(i == len && hyphen[i] != 0) while(hyphen[i]-- > 0) list.add('-');
				else if(i == 0 && hyphen[i] != 0) while(hyphen[i]-- > 0) list.add(0, '-');
				else while(hyphen[i]-- > 0) list.add(i, '-');
			}

			sb.append("#" + tc + " ");
			for(int i=0;i<list.size();i++)
				sb.append(list.get(i));
			sb.append("\n");
		}

		System.out.print(sb.toString());
	}
}
