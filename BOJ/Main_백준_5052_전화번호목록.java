import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_5052_전화번호목록 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());

			String[] array = new String[N];
			for(int i=0;i<N;i++)
				array[i] = br.readLine();

			Arrays.sort(array);

			boolean flag = true;
			for(int i=0;i<N-1;i++) {
				int curLen = array[i].length();
				int nextLen = array[i+1].length();

				if(curLen < nextLen) {
					if(array[i+1].indexOf(array[i]) == 0) {
						flag = false;
						break;
					}
				}
			}

			if(flag) sb.append("YES\n");
			else sb.append("NO\n");
		}

		System.out.print(sb.toString().trim());
	}
}