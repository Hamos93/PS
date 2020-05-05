import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2857_FBI {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		for(int i=1;i<=5;i++) {
			String line = br.readLine();
			
			if(line.contains("FBI")) {
				cnt++;
				System.out.print(i + " ");
			}
		}
		
		if(cnt == 0) System.out.print("HE GOT AWAY!");
	}
}