import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_20499_Darius님한타안함 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("/");
		
		int K = Integer.parseInt(input[0]);
		int D = Integer.parseInt(input[1]);
		int A = Integer.parseInt(input[2]);
		
		if(K + A < D || D == 0) System.out.print("hasu");
		else System.out.print("gosu");
	}
}