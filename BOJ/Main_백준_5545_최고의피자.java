import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_5545_최고의피자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken()); 
		
		int[] D = new int[N];
		
		int kcal = C, k = N;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			D[i] = Integer.parseInt(st.nextToken());
			kcal += D[i];
		}
		
		Arrays.sort(D);
		
		int result = Math.max(C / A, kcal / (A + B * k));
		for(int i=0;i<N;i++) {
			kcal -= D[i];
			k--;
			
			result = Math.max(result, kcal / (A + B * k));
		}
		
		System.out.print(result);
	}
}