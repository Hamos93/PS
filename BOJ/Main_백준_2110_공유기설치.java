import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2110_공유기설치 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int[] home = new int[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			home[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(home);
		
		int low = 1, high = home[N - 1] - home[0], distance = 0;
		while(low <= high) {
			int mid = (low + high) / 2;
			
			int pos = home[0], cnt = 1;
			for(int i=1;i<N;i++) {
				if(pos + mid <= home[i]) {
					pos = home[i];
					cnt++;
				}
			}
			
			if(C <= cnt) {
				low = mid + 1;
				distance = mid;
			}else high = mid - 1;
		}
		
		System.out.print(distance);
	}
}