import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2961_도영이가만든맛있는음식 {
	private static int N, result;
	private static List<int[]> list;
	
	public static void calc(int idx, int cnt, int S, int B) {
		if(1 <= cnt) result = Math.min(result, (int) Math.abs(S - B));
		if(idx == N) return;
	
		calc(idx + 1, cnt + 1, S * list.get(idx)[0], B + list.get(idx)[1]);
		calc(idx + 1, cnt, S, B);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		list = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int S = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			list.add(new int[] { S, B });
		}
		
		result = Integer.MAX_VALUE;
		for(int i=0;i<N;i++)
			calc(i, 0, 1, 0);

		System.out.print(result);
	}
}