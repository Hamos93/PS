import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1977_완전제곱수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		boolean[] visit = new boolean[10001];
		for(int i=1;i<=100;i++)
			visit[i * i] = true;
		
		st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
	
		int sum = 0, min = Integer.MAX_VALUE;
		boolean flag = false;
		for(int i=M;i<=N;i++){
			if(visit[i]){
				if(i < min) min = i;
	
				sum += i;
				
				flag = true;
			}
		}
		
		if(!flag) System.out.print("-1");
		else System.out.print(sum + "\n" + min);
	}
}