import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5532_방학숙제 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine(), " ");
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken());
	
		st = new StringTokenizer(br.readLine(), " ");
		int D = Integer.parseInt(st.nextToken());
	
		while(true) {
			if(A <= 0 && B <= 0) break;

			L--;
			
			A -= C;
			B -= D;
		}
		
		System.out.print(L);
	}
}