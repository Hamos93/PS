import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11023_더하기3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int sum = 0;
		while(st.hasMoreTokens()) sum += Integer.parseInt(st.nextToken());
		
		System.out.print(sum);
	}
}