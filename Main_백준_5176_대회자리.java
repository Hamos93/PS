import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5176_대회자리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken());
		while(K-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int P = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			boolean[] sit = new boolean[M+1];
			int answer = 0;
			
			while(P-- > 0){
				st = new StringTokenizer(br.readLine(), " ");
				int idx = Integer.parseInt(st.nextToken());
				
				if(sit[idx]) answer++;
				else sit[idx] = true;
				
			}
			
			System.out.println(answer);
		}
	}
}