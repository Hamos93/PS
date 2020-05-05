import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_9095_123더하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		// d[i]: i를 1, 2, 3의 합으로 나타내는 방법의 수
		int[] d = new int[11];
		d[0] = 1;
		d[1] = 1; 
		d[2] = 2;
		
		for(int i=3;i<11;i++)
			d[i] = d[i-1] + d[i-2] + d[i-3];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			System.out.println(d[n]);
		}
	}
}