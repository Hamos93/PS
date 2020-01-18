import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1978_소수찾기 {
	private static boolean isPrime(int num){
		if(num == 1) return false;
		
		boolean flag = true;
		for(int i=2;i<=num-1;i++){
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(N-- > 0){
			int num = Integer.parseInt(st.nextToken());
			
			if(isPrime(num)) answer++;
		}
		
		System.out.print(answer);
	}
}