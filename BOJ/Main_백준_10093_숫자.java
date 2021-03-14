import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10093_숫자 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		if(B < A) {
			long temp = A;
			A = B;
			B = temp;
		}
		
		int cnt = 0;
		for(long i=A+1;i<B;i++) {
			cnt++;
			sb.append(i + " ");
		}
		
		System.out.print(cnt + "\n" + sb.toString().trim());
	}
}