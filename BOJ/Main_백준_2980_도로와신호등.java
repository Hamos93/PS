import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2980_도로와신호등 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
	
		int time = 0, pre = 0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int D = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int G = Integer.parseInt(st.nextToken());
		
			time += D - pre;
			pre = D;
			
			int wait = time % (R + G);
			if(wait <= R) time += R - wait;
		}
		
		time += (L - pre);
		System.out.print(time);
	}
}