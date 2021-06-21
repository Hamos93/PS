import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_9280_진용이네주차타워 {
	private static int[] R;
	private static int[] W;
	private static int[] park;
	private static int[] input;
	private static int price;

	public static boolean isFull(int n) {
		boolean flag = true;

		for (int i=0;i<n;i++) {
			if (park[i] == Integer.MIN_VALUE) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void getIn(int idx, int n){
		for(int i=0;i<n;i++){
			if(park[i] == Integer.MIN_VALUE){
				price += R[i] * W[idx];
				park[i] = idx;

				break;
			}
		}
	}

	public static void getOut(int n, int len){
		int idx = 0;
		for(int i=0;i<len;i++){
			if(input[i] < 0){
				idx = input[i] * -1;
				input[i] = 0;

				break;
			}
		}

		for(int i=0;i<n;i++) {
			if(park[i] == idx) {
				park[i] = Integer.MIN_VALUE;
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		for(int tc=1;tc<=T;tc++){
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			R = new int[n];
			park = new int[n];
			
			Arrays.fill(park, Integer.MIN_VALUE);
			
			for(int i=0;i<n;i++){
				st = new StringTokenizer(br.readLine(), " ");
				R[i] = Integer.parseInt(st.nextToken());
			}

			W = new int[m+1];
			for(int i=1;i<=m;i++){
				st = new StringTokenizer(br.readLine(), " ");
				W[i] = Integer.parseInt(st.nextToken());
			}

			input = new int[2 * m];
			for(int i=0;i<2*m;i++){
				st = new StringTokenizer(br.readLine(), " ");
				input[i] = Integer.parseInt(st.nextToken());
			}

			price = 0;
			for(int i=0;i<2*m;i++){
				int idx = input[i];

				if(idx == 0) continue;

				if(0 < idx){
					if(!isFull(n)) getIn(idx, n);
					else{
						getOut(n, 2 * m);
						getIn(idx, n);
					}
				}else if(idx < 0) getOut(n, 2 * m);
			}

			sb.append("#" + tc + " " + price + "\n");
		}

		System.out.print(sb.toString().trim());
	}
}