import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_20053_최소최대2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
	
			int N = Integer.parseInt(st.nextToken());
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				
				min = num < min ? num : min;
				max = max < num ? num : max;
			}
			
			System.out.println(min + " " + max);
		}
	}
}