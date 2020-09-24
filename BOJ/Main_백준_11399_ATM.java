import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_11399_ATM {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] time = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			time[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(time);
		
		int preSum = 0, sum = 0;
		for(int i=0;i<N;i++) {
			preSum += time[i];
			sum += preSum;
		}
		
		System.out.print(sum);
	}
}