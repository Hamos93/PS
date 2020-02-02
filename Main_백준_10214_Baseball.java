import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10214_Baseball {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		int Y = 0, K = 0;
		while(T-- > 0){
			int play = 9;

			while(play-- > 0){
				st = new StringTokenizer(br.readLine(), " ");

				Y += Integer.parseInt(st.nextToken());
				K += Integer.parseInt(st.nextToken());
			}

			if(K < Y) System.out.println("Yonsei");
			else if(Y < K) System.out.println("Korea");
			else System.out.println("Draw");
		}
	}
}