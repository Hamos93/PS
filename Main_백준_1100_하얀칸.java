import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1100_하얀칸 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int answer = 0;
		for(int i=0;i<8;i++) {
			String line = br.readLine().trim();
			for(int j=0;j<8;j++) {
				char ch = line.charAt(j);
				
				if(i % 2 == 0 && j % 2 == 0 && ch == 'F') answer++;
				if(i % 2 == 1 && j % 2 == 1 && ch == 'F') answer++;
			}
		}
		
		System.out.print(answer);
	}
}