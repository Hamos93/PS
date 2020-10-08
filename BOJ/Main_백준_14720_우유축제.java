import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14720_우유축제 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] milk = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			milk[i] = Integer.parseInt(st.nextToken());
		
		int flavor = 0, cnt = 0;
		for(int i=0;i<N;i++) {
			if(flavor == milk[i]) {
				cnt++;
				flavor++;
				
				if(flavor == 3) flavor %= 3;
			}
		}

		System.out.print(cnt);
	}
}