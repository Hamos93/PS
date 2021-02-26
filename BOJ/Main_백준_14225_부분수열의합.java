import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_백준_14225_부분수열의합 {
	private static int[] S;
	private static Set<Integer> set;
	
	public static void subsequence(int idx, int sum, int N) {
		if(sum != 0) set.add(sum);
		if(idx == N) return;
		
		subsequence(idx + 1, sum + S[idx], N);
		subsequence(idx + 1, sum, N);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		S = new int[N];
		
		for(int i=0;i<N;i++)
			S[i] = Integer.parseInt(st.nextToken());
		
		set = new TreeSet<>();
		
		subsequence(0, 0, N);
		
		int value = 1;
		while(true) {
			if(!set.contains(value)) {
				System.out.print(value);
				return;
			}
			
			value++;
		}
	}
}