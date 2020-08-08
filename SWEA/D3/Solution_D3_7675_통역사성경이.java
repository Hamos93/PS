import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7675_통역사성경이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			String[] word = br.readLine().split(" ");

			int[] cnt = new int[N];
			int idx = 0;
			
			for(int i=0;i<word.length;i++) {
				int len = word[i].length();
				boolean flag = true, end = false;

				if(word[i].charAt(len-1) == '.' || word[i].charAt(len-1) == '!' || word[i].charAt(len-1) == '?') end = true;
				for(int j=0;j<len;j++) {
					char ch = word[i].charAt(j);

					if(j == 0) {
						if(ch < 65 || 90 < ch) {
							flag = false;
							break;
						}
					}

					if(!end) {
						if(0 < j && j < len) {
							if(ch < 97 || 122 < ch) {
								flag = false;
								break;
							}
						}
					}else {
						if(0 < j && j < len - 1) {
							if(ch < 97 || 122 < ch) {
								flag = false;
								break;
							}
						}
					}
				}
				
				if(flag) cnt[idx]++;
				if(end) idx++;
			}
			
			System.out.print("#" + tc + " ");
			for(int i=0;i<N;i++)
				System.out.print(cnt[i] + " ");
			System.out.println();
		}
	}
}