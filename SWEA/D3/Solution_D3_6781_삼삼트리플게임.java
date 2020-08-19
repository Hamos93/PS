import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_6781_삼삼트리플게임 {
	private static int sameColor(int[] arr) {
		int result = 0;
		for(int i=1;i<=9;i++) {
			if(3 <= arr[i]) {
				result += 1;
				arr[i] -= 3;
			}
		}

		return result;
	}

	private static int sequenceNum(int[] arr) {
		int result = 0;
		for(int i=1;i<=7;i++) {
			if(1 <= arr[i] && 1 <= arr[i+1] && 1 <= arr[i+2]) {
				int temp = Math.min(arr[i], arr[i+1]);
				int value = Math.min(temp, arr[i+2]);

				arr[i] -= value; arr[i+1] -= value; arr[i+2] -= value;

				result += value;
			}
		}

		return result;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String num = br.readLine().trim();
			String color = br.readLine().trim();

			int[] red = new int[10];
			int[] green = new int[10];
			int[] blue = new int[10];

			for(int i=0;i<num.length();i++) {
				int n = num.charAt(i) - '0';
				char c = color.charAt(i);

				if(c == 'R') red[n]++;
				if(c == 'G') green[n]++;
				if(c == 'B') blue[n]++;
			}

			int cnt = 0;

			// 1. 동일한 색의 카드 3장 찾기
			cnt += sameColor(red);
			cnt += sameColor(green);
			cnt += sameColor(blue);

			// 2. 연속한 색의 카드 3장 찾기
			cnt += sequenceNum(red);
			cnt += sequenceNum(green);
			cnt += sequenceNum(blue);

			if(cnt == 3) System.out.println("#" + tc + " Win");
			else System.out.println("#" + tc + " Continue");
		}
	}
}