import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11966_2의제곱인가 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		if(N == 1) {
			System.out.print("1");
			return;
		}
		
		boolean flag = false;
		for(int i=1;i<=30;i++){
			if(N == (int)Math.pow(2, i)){
				flag = true;
				break;
			}
		}
		
		if(flag) System.out.print("1");
		else System.out.print("0");
	}
}