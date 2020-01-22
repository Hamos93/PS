import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_5576_콘테스트 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] W = new int[10];
		int[] K = new int[10];
	
		for(int i=0;i<10;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			W[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<10;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			K[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(W);
		Arrays.sort(K);

		int result1 = W[7] + W[8] + W[9];
		int result2 = K[7] + K[8] + K[9];
		
		System.out.print(result1 + " " + result2);
	}
}