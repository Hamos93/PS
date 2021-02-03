import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main_백준_2992_크면서작은수 {
	private static int len;
	private static char[] data;
	private static char[] res;
	private static boolean[] visit;
	private static PriorityQueue<Integer> pq;
	
	public static void permutation(int N, int R, int depth, int X) {
		if(depth == R) {
			String str = "";
			for(char ch : res)
				str += ch;
			
			int value = Integer.parseInt(str);
			
			if(value <= X) return;
			
			pq.offer(value);
			
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = data[i];
				
				permutation(N, R, depth + 1, X);
			
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		data = Integer.toString(X).toCharArray();
		len = data.length;
		
		res = new char[len];
		visit = new boolean[len];
	
		pq = new PriorityQueue<>();
		permutation(len, len, 0, X);
	
		if(pq.size() == 0) System.out.print("0");
		else System.out.print(pq.poll());
	}
}