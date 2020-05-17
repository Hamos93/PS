import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_6730_장애물경주난이도 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			int[] block = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				block[i] = Integer.parseInt(st.nextToken());
			
			int max = 0, min = 0;
			for(int i=1;i<N;i++) {
				if(block[i-1] < block[i]) max = max < (block[i] - block[i-1]) ? (block[i]- block[i-1]) : max;
				if(block[i] < block[i-1]) min = min < (block[i-1] - block[i]) ? (block[i-1] - block[i]) : min;
			}
			
			System.out.println("#" + tc + " " + max + " " + min);
		}
	}
}