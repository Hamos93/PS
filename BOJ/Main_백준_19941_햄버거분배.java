import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_19941_햄버거분배 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		char[] arr = br.readLine().toCharArray();
		boolean[] visit = new boolean[N];
		int cnt = 0;
		
		for(int i=0;i<N;i++) {
			if(arr[i] == 'H') continue;
			
			boolean flag = false;
			int idx = i - K;
			
			if(idx < 0) idx = 0;
			
			while(idx < i) {
				if(arr[idx] == 'H' && !visit[idx]) {
					visit[idx] = true;
					flag = true;
					cnt++;
					
					break;
				}
				
				idx++;
			}
			
			if(flag) continue;
			
			idx = i + 1;
			while(idx < N && idx <= i + K) {
				if(arr[idx] == 'H' && !visit[idx]) {
					visit[idx] = true;
					cnt++;
					
					break;
				}

				idx++;
			}
		}
		
		System.out.print(cnt);
	}
}