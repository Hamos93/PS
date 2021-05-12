import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2548_대표자연수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[10001];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			arr[Integer.parseInt(st.nextToken())]++;
	
		int num = 0, diff = Integer.MAX_VALUE;
		for(int i=1;i<=10000;i++) {
			if(arr[i] == 0) continue;
			int res = 0;
			for(int j=1;j<=10000;j++) {
				if(arr[j] == 0) continue;
				res += Math.abs(i - j) * arr[j];
			}
			
			if(res < diff) {
				diff = res;
				num = i;
			}
		}
		
		System.out.print(num);
	}
}