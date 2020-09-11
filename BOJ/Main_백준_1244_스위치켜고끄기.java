import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1244_스위치켜고끄기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int[] power = new int[N + 1];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=N;i++)
			power[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");

		int M = Integer.parseInt(st.nextToken());
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");

			int gender = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			if(gender == 1) {
				for(int i=num;i<=N;i+=num) {
					if(power[i] == 1) power[i] = 0;
					else power[i] = 1;
				}
			}else {
				int idx1 = num, idx2 = num;

				while((1 <= idx1 - 1 && idx2 + 1 <= N) && (power[idx1 - 1] == power[idx2 + 1])) {
					idx1--; idx2++;
				}

				for(int i=idx1;i<=idx2;i++) {
					if(power[i] == 1) power[i] = 0;
					else power[i] = 1;
				}
			}
		}

		for(int i=1;i<=N;i++) {
			System.out.print(power[i] + " ");
			if(i % 20 == 0) System.out.println();
		}
	}
}