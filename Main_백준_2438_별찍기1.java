import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2438_별찍기1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++){
			for(int j=0;j<=i;j++)
				sb.append("*");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}