import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2577_숫자의개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] num = new int[10];
		
		st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int B = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken());
	
		String result = Integer.toString(A * B * C);
		for(int i=0;i<result.length();i++)
			num[result.charAt(i) - '0']++;
		
		for(int i=0;i<10;i++)
			System.out.println(num[i]);
	}
}