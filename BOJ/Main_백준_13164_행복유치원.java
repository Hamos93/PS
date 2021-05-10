import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_13164_행복유치원 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] height = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			height[i] = Integer.parseInt(st.nextToken());
		
		int[] diff = new int[N-1];
		for(int i=1;i<N;i++)
			diff[i-1] = height[i] - height[i-1];
		
		Arrays.sort(diff);
		
		int cost = 0;
		for(int i=0;i<N-K;i++)
			cost += diff[i];
		
		System.out.print(cost);
	}
}