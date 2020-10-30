import java.util.HashSet;
import java.util.Set;

public class Solution_L2_소수찾기 {
    private static int N;
	private static char[] data;
	private static char[] res;
	private static boolean[] visit;
	private static Set<Integer> hashSet;
	
	public static void permutation(int N, int R, int depth) {
		if(1 <= depth && depth <= R) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<depth;i++)
				sb.append(res[i]);
			
			int prime = Integer.parseInt(sb.toString());
			
			boolean flag = true;
			for(int i=2;i<prime;i++) {
				if(prime % i == 0) {
					flag = false;
					break;
				}
			}
			
			if(prime <= 1) flag = false;

			if(flag) hashSet.add(prime);
			
			if(depth == R) return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = data[i];

				permutation(N, R, depth + 1);
				
				visit[i] = false;
			}
		}
	}
	
	public static int solution(String numbers) {
        N = numbers.length();
        
        data = numbers.toCharArray();
        res = new char[N];
        visit = new boolean[N];

        hashSet = new HashSet<>();
        permutation(N, N, 0);
        
        return hashSet.size();
    }
    
	public static void main(String[] args) {
		System.out.print(solution("17"));
	}
}