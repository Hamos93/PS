import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_2841_외계인의기타연주 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		Stack<Integer>[] stack = new Stack[7];
		for(int i=1;i<=6;i++) {
			stack[i] = new Stack<>();
			stack[i].add(0);
		}
		
		int cnt = 0;
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");

			int line = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());

			if(stack[line].peek() < f) {
				stack[line].add(f);
				cnt++;
			}else {
				while(f < stack[line].peek()) {
					stack[line].pop();
					cnt++;
				}

				if(stack[line].peek() == f) continue;
				else {
					stack[line].add(f);
					cnt++;
				}
			}
		}

		System.out.print(cnt);
	}
}