import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_11328_Strfry {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			char[] A = st.nextToken().toCharArray();
			char[] B = st.nextToken().toCharArray();
			
			Arrays.sort(A);
			Arrays.sort(B);
			
			boolean flag = true;
			for(int i=0;i<A.length;i++) {
				if(A[i] != B[i]) {
					flag = false;
					break;
				}
			}
			
			if(flag) sb.append("Possible\n");
			else sb.append("Impossible\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}