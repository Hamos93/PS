import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1008_A_B {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		System.out.print(A / B);
	}
}