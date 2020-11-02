import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11501_주식 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			long[] stock = new long[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				stock[i] = Long.parseLong(st.nextToken());
			
			long benefit = 0, price = 0;
			for(int i=N-1;0<=i;i--) {
				if(price < stock[i]) price = stock[i];
				
				if(stock[i] < price)
					benefit += price - stock[i];
			}
			
			System.out.println(benefit);
		}
	}
}