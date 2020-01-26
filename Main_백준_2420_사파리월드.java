import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2420_사파리월드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long N = Integer.parseInt(st.nextToken());
		long M = Integer.parseInt(st.nextToken());

		System.out.print(Math.abs(N - M));
	}
}