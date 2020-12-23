import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2437_저울 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] weight = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			weight[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(weight);
		
		int sum = 0;
		for(int i=0;i<N;i++) {
			if(sum + 1 < weight[i]) break;
			else sum += weight[i];
		}

		System.out.print(sum + 1);
	}
}