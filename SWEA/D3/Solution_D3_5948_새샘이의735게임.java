import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_5948_새샘이의735게임 {
	private static int[] data;
	private static int[] res;
	private static boolean[] visit;
	private static List<Integer> list;
	
	private static void permutation(int n, int r, int depth) {
		if(depth == r) {
			int sum = 0;
			
			for(int i=0;i<r;i++)
				sum += res[i];
			
			if(!list.contains(sum)) list.add(sum);
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				res[depth] = data[i];
				
				permutation(n, r, depth + 1);
				
				visit[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			data = new int[7];
			for(int i=0;i<7;i++)
				data[i] = Integer.parseInt(st.nextToken());
			
			res = new int[3];
			visit = new boolean[7];
			list = new ArrayList<>();
			
			permutation(7, 3, 0);
			
			Collections.sort(list);
			
			System.out.println("#" + tc + " " + list.get(list.size() - 5));
		}
	}
}