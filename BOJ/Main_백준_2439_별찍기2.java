import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2439_별찍기2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++){
			for(int j=N-1;0<=j;j--){
				if(j <= i) sb.append("*");
				else sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}