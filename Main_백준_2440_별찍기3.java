import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2440_별찍기3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++){
			for(int j=N-1;0<=j;j--)
				if(i <= j) sb.append("*");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}