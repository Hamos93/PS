import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14696_딱지놀이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		while(0 < N--) {
			int[] A = new int[5];
			int[] B = new int[5];
			
			st = new StringTokenizer(br.readLine(), " ");
			Integer.parseInt(st.nextToken());
			
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());

				A[num]++;
			}

			st = new StringTokenizer(br.readLine(), " ");
			Integer.parseInt(st.nextToken());

			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());

				B[num]++;
			}
			
			int result = 0;
			for(int i=4;1<=i;i--) {
				if(A[i] == B[i]) continue;
				
				if(B[i] < A[i]) {
					result = 1;
					break;
				}else {
					result = 2;
					break;
				}
			}
			
			if(result == 0) System.out.println("D");
			else if(result == 1) System.out.println("A");
			else System.out.println("B");
		}
	}
}