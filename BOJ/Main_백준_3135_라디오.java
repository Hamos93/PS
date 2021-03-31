import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_3135_라디오 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int[] bookmark = new int[N];

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bookmark[i] = Integer.parseInt(st.nextToken());
		}

		int click = Math.abs(A - B);
		for(int i=0;i<N;i++) {
			click = Math.min(click, Math.abs(bookmark[i] - B) + 1);
		}

		System.out.print(click);
	}
}