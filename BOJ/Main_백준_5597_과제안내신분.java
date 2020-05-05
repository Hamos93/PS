import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_5597_과제안내신분 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] student = new boolean[31];
		
		for(int i=0;i<28;i++) {
			int num = Integer.parseInt(br.readLine());
			
			student[num] = true;
		}
		
		for(int i=1;i<31;i++)
			if(!student[i]) System.out.println(i);
	}
}