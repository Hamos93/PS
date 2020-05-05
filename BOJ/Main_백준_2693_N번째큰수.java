import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2693_N번째큰수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0) {
			int[] A = new int[10];

			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<10;i++)
				A[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(A);
			System.out.println(A[7]);
		}
	}
}