import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_20361_일우는야바위꾼 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		boolean[] flag = new boolean[N + 1];
		flag[X] = true;

		while(0 < K--) {
			st = new StringTokenizer(br.readLine(), " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if(flag[A] || flag[B]) {
				if(flag[A]) {
					flag[A] = false;
					flag[B] = true;
				}else {
					flag[B] = false;
					flag[A] = true;
				}
			}
		}
		
		int answer = 0;
		for(int i=1;i<=N;i++) {
			if(flag[i]) {
				answer = i;
				break;
			}
		}
		
		System.out.print(answer);
	}
}