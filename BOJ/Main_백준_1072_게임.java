import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1072_게임 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		long X = Long.parseLong(st.nextToken());
		long Y = Long.parseLong(st.nextToken());
		long Z = (Y * 100) / X;

		long low = 1, high = Integer.MAX_VALUE;
		long result = -1;
		while(low <= high) {
			long mid = (low + high) / 2;
			long value = ((Y + mid) * 100) / (X + mid);

			if(Z < value) {
				result = mid;
				high = mid - 1;
			}else low = mid + 1;
		}

		System.out.print(result);
	}
}