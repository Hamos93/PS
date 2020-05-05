import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10707_수도요금 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int xPrice = 0, yPrice = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int D = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int P = Integer.parseInt(st.nextToken());
		
		xPrice = A * P;
		
		if(P <= C) yPrice = B;
		else yPrice = B + (P - C) * D;
		
		int answer = xPrice < yPrice ? xPrice : yPrice;
		System.out.print(answer);
	}
}