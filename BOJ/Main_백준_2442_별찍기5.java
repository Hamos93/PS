import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2442_별찍기5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++){
			for(int j=N-1;0<=j;j--){
				if(j <= i) sb.append("*");
				else sb.append(" ");
			}
			
			for(int k=1;k<=i;k++)
				sb.append("*");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}