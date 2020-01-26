import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5717_상근이의친구들 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		while(true){
			st = new StringTokenizer(br.readLine(), " ");
			
			int M = Integer.parseInt(st.nextToken());
			int F = Integer.parseInt(st.nextToken());
		
			if(M == 0 && F == 0) break;
			
			System.out.println((M + F));
		}
	}
}
