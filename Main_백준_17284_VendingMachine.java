import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_17284_VendingMachine {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int answer = 5000;
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) answer -= 500;
			if(num == 2) answer -= 800;
			if(num == 3) answer -= 1000;
		}
		
		System.out.print(answer);
	}
}