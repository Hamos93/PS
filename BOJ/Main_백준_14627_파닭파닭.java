import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14627_파닭파닭 {
	public static boolean cut(long mid, int[] greenOnion, int S, int C) {
		int cnt = 0;
		for(int i=0;i<S;i++)
			cnt += greenOnion[i] / mid;
		
		if(C <= cnt) return true;
		else return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int S = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int[] greenOnion = new int[S];
		int max = 0;
		for(int i=0;i<S;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			greenOnion[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, greenOnion[i]);
		}
		
		long low = 1, high = max;
		long len = 0;
		while(low <= high) {
			long mid = (low + high) / 2;
			
			if(cut(mid, greenOnion, S, C)) {
				len = mid;
				low = mid + 1;
			}else high = mid - 1;
		}
		
		if(len == 0) {
			System.out.print("0");
			return;
		}
		
		long sum = 0;
		for(int i=0;i<S;i++)
			sum += greenOnion[i];
		
		sum -= len * C;
	
		System.out.print(sum);
	}
}