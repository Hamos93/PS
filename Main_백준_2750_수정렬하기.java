import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2750_수정렬하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] num = new int[N];
		
		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++){
			if(i == N-1) sb.append(num[i]);
			else sb.append(num[i] + "\n");
		}
		
		System.out.print(sb.toString());
	}
}