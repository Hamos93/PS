import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D2_1966_숫자를정렬하자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			int[] array = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				array[i] = Integer.parseInt(st.nextToken());
		
			Arrays.sort(array);
			sb.append("#" + tc + " ");
			
			for(int i=0;i<N;i++)
				sb.append(array[i] + " ");
			
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}