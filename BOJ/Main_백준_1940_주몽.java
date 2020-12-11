import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1940_주몽 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] array = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			array[i] = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int i=0;i<N;i++) {
			if(array[i] == -1) continue;
			for(int j=i+1;j<N;j++) {
				if(array[j] == -1) continue;
				if(array[i] + array[j] == M) {
					cnt++;
					array[i] = array[j] = -1;

					break;
				}
			}
		}
		
		System.out.print(cnt);
	}
}