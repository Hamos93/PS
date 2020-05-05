import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1152_단어의개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().trim().split(" ");
		
		if(line[0].isEmpty()) System.out.print("0");
		else System.out.print(line.length);
	}
}