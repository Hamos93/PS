import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_11728_배열합치기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] C = new int[N+M];
		int idx = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) C[idx++] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) C[idx++] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(C);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N+M;i++)
			sb.append(C[i] + " ");
		
		System.out.print(sb.toString());
	}
}