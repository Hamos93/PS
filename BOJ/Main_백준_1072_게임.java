import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1072_게임 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String line = br.readLine();
			
			if(line == null || line.length() == 0) break;
			
			String[] input = line.split(" ");
			
			long X = Long.parseLong(input[0]);
			long Y = Long.parseLong(input[1]);
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

			System.out.println(result);
		}
	}
}