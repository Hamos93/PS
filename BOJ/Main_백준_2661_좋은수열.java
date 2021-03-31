import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2661_좋은수열 {
	private static String sequence;
	private static boolean flag;
	private static final int[] data = { 1, 2, 3 };
	
	public static void dfs(String str, int len, int N) {
		if(len % 2 == 1) {
			for(int i=1;i<len/2;i++) {
				if(str.substring(len - i).equals(str.substring(len - 2 * i, len - i))) 
					return;
			}
		}else {
			for(int i=1;i<=len/2;i++) {
				if(str.substring(len - i).equals(str.substring(len - 2 * i, len - i)))
					return;
			}
		}
		
		if(len == N && !flag) {
			sequence = str;
			flag = true;
			
			return;
		}
		
		for(int i=0;i<3;i++) {
			dfs(str + data[i], len + 1, N);
			
			if(flag) return;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
	
		sequence = "";
		flag = false;
		
		dfs("", 0, N);
		
		System.out.print(sequence);
	}
}