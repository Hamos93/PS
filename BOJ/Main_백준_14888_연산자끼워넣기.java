import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14888_연산자끼워넣기 {
	private static int[] operand;
	private static char[] operator;
	private static char[] res;
	private static boolean[] visit;
	private static int max, min;

	private static void permutation(int n, int r, int depth) {
		if(depth == r) {
			int result = operand[0];

			for(int i=0;i<r;i++) {
				switch (res[i]) {
				case '+':
					result += operand[i+1];
					break;
				case '-':
					result -= operand[i+1];
					break;
				case '*':
					result *= operand[i+1];
					break;
				case '/':
					if(result < 0) {
						result *= -1;
						result /= operand[i+1];
						result *= -1;
						break;
					}else {
						result /= operand[i+1];
						break;
					}
				}
			}
			
			max = max < result ? result : max;
			min = result < min ? result : min; 
			
			return;
		}

		for(int i=0;i<r;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = operator[i];

				permutation(n, r, depth + 1);

				visit[i] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		operand = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			operand[i] = Integer.parseInt(st.nextToken());

		operator = new char[N-1];
		st = new StringTokenizer(br.readLine(), " ");

		int i = 0, cnt = 1;
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());

			while(0 < num--) {
				if(cnt == 1) operator[i++] = '+';
				else if(cnt == 2) operator[i++] = '-';
				else if(cnt == 3) operator[i++] = '*';
				else operator[i++] = '/';
			}

			cnt++;
		}

		res = new char[N-1];
		visit = new boolean[N-1];

		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;

		permutation(N-1, N-1, 0);

		System.out.print(max + "\n" + min);
	}
}