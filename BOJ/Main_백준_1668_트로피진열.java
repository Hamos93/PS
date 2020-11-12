import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1668_트로피진열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		
		int[] trophy = new int[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			trophy[i] = Integer.parseInt(st.nextToken());
		}
		
		int leftCnt = 1;
		for(int i=1;i<N;i++) {
			boolean flag = true;
			for(int j=0;j<i;j++) {
				if(trophy[i] <= trophy[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) leftCnt++; 
		}
		
		int rightCnt = 1;
		for(int i=N-2;0<=i;i--) {
			boolean flag = true;
			for(int j=N-1;i<j;j--) {
				if(trophy[i] <= trophy[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) rightCnt++; 
		}
		
		System.out.print(leftCnt + "\n" + rightCnt);
	}
}