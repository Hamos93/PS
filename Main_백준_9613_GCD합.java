import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_9613_GCD합 {
	private static int GCD(int a, int b){
		int r = 0;
		while(true){
			r = a % b;
			
			if(r == 0) break;
			
			a = b;
			b = r;
		}
		
		return b;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] num = new int[N];
			
			for(int i=0;i<N;i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			long sum = 0;
			for(int i=0;i<N;i++){
				for(int j=i+1;j<N;j++)
					sum += GCD(num[i], num[j]);
			}
			
			System.out.println(sum);
		}
	}
}