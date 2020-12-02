import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_20155_우리집밑에편의점이있는데 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		int[] store = new int[M + 1];
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) 
			store[Integer.parseInt(st.nextToken())]++;
	
		int cnt = 0;
		for(int i=1;i<=M;i++)
			cnt = cnt < store[i] ? store[i] : cnt;
			
		System.out.print(cnt);
	}
}