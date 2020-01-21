import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1463_1로만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		// d[i]: i를 1로만 드는 연산의 최소 횟수
		int[] d = new int[N+1];
		
		for(int i=2;i<=N;i++) {
			// 1로 빼는 경우
			d[i] = d[i-1] + 1;
	
			// i가 2로 나눠 떨어지는 경우
			if(i%2 == 0) d[i] = Math.min(d[i], d[i/2] + 1);
			
			// i가 3으로 나눠 떨어지는 경우
			if(i%3 == 0) d[i] = Math.min(d[i], d[i/3] + 1);
		}
		
		System.out.print(d[N]);
	}
}