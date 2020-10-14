import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10813_공바꾸기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] basket = new int[N+1];
		for(int i=1;i<=N;i++)
			basket[i] = i;
	
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
		
			int temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
		}
		
		for(int i=1;i<=N;i++)
			System.out.print(basket[i] + " ");
	}
}