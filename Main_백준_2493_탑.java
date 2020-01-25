import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2493_탑 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] top = new int[N+1];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=N;i++)
			top[i] = Integer.parseInt(st.nextToken());
		
		for(int i=N;1<=i;i--){
			boolean flag = false;
			for(int j=i-1;1<=j;j--){
				if(top[i] <= top[j]){
					flag = true;
					
					top[i] = j;
					break;
				}
			}
			
			if(!flag) top[i] = 0;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++)
			sb.append(top[i] + " ");
		
		System.out.print(sb.toString());
	}
}