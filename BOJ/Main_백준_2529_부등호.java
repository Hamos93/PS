import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2529_부등호 {
	private static int k;
	private static long maxNum, minNum;
	private static String max, min;
	private static char[] inequality;
	private static int[] num;
	private static int[] res;
	private static boolean[] visit;
	
	public static void permutation(int N, int R, int depth) {
		if(depth == R) {
			boolean flag = true;
			for(int i=0;i<k;i++) {
				if(inequality[i] == '>') {
					if(res[i] <= res[i+1]) {
						flag = false;
						break;
					}
				}else {
					if(res[i] >= res[i+1]) {
						flag = false;
						break;
					}
				}
			}
			
			if(flag) {
				StringBuilder sb = new StringBuilder();
				
				for(int v : res)
					sb.append(v);
				
				long value = Long.parseLong(sb.toString());
				
				if(maxNum < value) {
					max = sb.toString().trim();
					maxNum = value;
				}
				
				if(value < minNum) {
					min = sb.toString().trim();
					minNum = value;
				}
			}
			
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = num[i];
				
				permutation(N, R, depth + 1);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		k = Integer.parseInt(st.nextToken());
		inequality = new char[k];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<k;i++)
			inequality[i] = st.nextToken().charAt(0);

		num = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		res = new int[k+1];
		visit = new boolean[10];
		
		maxNum = Long.MIN_VALUE; minNum = Long.MAX_VALUE;
		max = min = "";
		
		permutation(10, k+1, 0);
		
		System.out.print(max + "\n" + min);
	}
}