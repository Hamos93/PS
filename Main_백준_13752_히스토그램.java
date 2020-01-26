import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13752_히스토그램 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		while(N-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int K = Integer.parseInt(st.nextToken());
			for(int i=1;i<=K;i++)
				System.out.print("=");
			
			System.out.println();
		}
	}
}