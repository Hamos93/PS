import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5162_두가지빵의딜레마 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if(B < A) {
				int temp = A;
				A = B;
				B = temp;
			}
			
			int answer = C / A;
			C %= A;
			
			if(C == 0) {
				System.out.println("#" + tc + " " + answer);
				continue;
				}
			
			answer += C / B;
			System.out.println("#" + tc + " " + answer);
		}
	}
}