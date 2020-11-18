import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_15810_풍선공장 {
	public static boolean blow(long mid, int[] staff, int N, int M) {
		long cnt = 0;
		for(int i=0;i<N;i++)
			cnt += mid / staff[i];

		return M <= cnt;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] staff = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			staff[i] = Integer.parseInt(st.nextToken());

		long low = 1, high = 1000000000001L;
		long result = 0;
		while(low <= high) {
			long mid = (low + high) / 2;

			if(blow(mid, staff, N, M)) {
				result = mid;
				high = mid - 1;
			}else low = mid + 1;
		}

		System.out.print(result);
	}
}