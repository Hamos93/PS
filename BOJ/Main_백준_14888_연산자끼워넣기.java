import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_14888_연산자끼워넣기 {
	private static int N, max, min;
	private static int[] operand;
	private static char[] operator;
	private static boolean[] visit;
	private static char[] res;
	
	private static void permutation(int n, int r, int depth){
		if(r == depth){
			int result = operand[0];
			
			for(int i=0;i<N-1;i++){
				if(res[i] == '+') result += operand[i+1];
				if(res[i] == '-') result -= operand[i+1];
				if(res[i] == '*') result *= operand[i+1];
				if(res[i] == '/') {
					if(result < 0){
						result *= -1;
						result /= operand[i+1];
						result *= -1;
					} else result /= operand[i+1];
				}
			}
			
			max = max < result ? result : max;
			min = result < min ? result : min;
			
			return;
		}
		
		for(int i=0;i<N-1;i++){
			if(!visit[i]){
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

		N = Integer.parseInt(st.nextToken());
		operand = new int[N];
		operator = new char[N-1];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			operand[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int idx = 0;
		List<Character> list = new ArrayList<>();
		while(st.hasMoreTokens()){
			int value = Integer.parseInt(st.nextToken());
			
			while(value-- > 0){
				if(idx == 0) list.add('+');
				if(idx == 1) list.add('-');
				if(idx == 2) list.add('*');
				if(idx == 3) list.add('/');
			}
			
			idx++;
		}
		
		for(int i=0;i<N-1;i++)
			operator[i] = list.get(i);
		
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		visit = new boolean[N-1];
		res = new char[N-1];
		permutation(N-1, N-1, 0);
		
		System.out.print(max + "\n" + min);
	}
}