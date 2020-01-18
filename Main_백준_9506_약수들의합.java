import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_9506_약수들의합 {
	private static boolean perfectNumber(int n){
		int sum = 0;
		
		for(int i=1;i<=n-1;i++){
			if(n % i == 0) sum += i;
		}
		
		if(sum == n) return true;
		
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while(true){
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			
			if(n == -1) break;
			
			if(perfectNumber(n)){
				StringBuilder sb = new StringBuilder();
				sb.append(n + " = ");
				
				for(int i=1;i<n/2;i++)
					if(n % i == 0) sb.append(i + " + ");
				
				sb.append(n/2);
				
				System.out.println(sb.toString());
			}else System.out.println(n + " is NOT perfect.");
		}
	}
}