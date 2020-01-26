import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2460_지능형기차2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int answer = 0, result = 0;
		for(int i=1;i<=10;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			int start = Integer.parseInt(st.nextToken());
			int destination = Integer.parseInt(st.nextToken());
			
			if(i == 1) result = start + destination;
			else result = result - start + destination;
			
			answer = answer < result ? result : answer; 
		}
		
		System.out.print(answer);
	}
}