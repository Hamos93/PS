import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2872_우리집엔도서관이있어 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] book = new int[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			book[i] = Integer.parseInt(st.nextToken());
		}
		
		int check = N, cnt = 0;
		for(int i=N-1;0<=i;i--) {
			if(book[i] == check) check--;
			else cnt++;
		}
		
		System.out.print(cnt);
	}
}