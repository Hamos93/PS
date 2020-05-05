import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_3047_ABC {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] num = new int[3];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<3;i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(num);
		
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		for(int i=0;i<line.length();i++) 
			sb.append(num[line.charAt(i) - 65] + " ");

		System.out.println(sb.toString());
	}
}