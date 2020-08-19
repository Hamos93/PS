import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1231_중위순회 {
	private static StringBuilder sb;
	
	private static void inorder(char[] arr, int idx, int N) {
		if(N < idx) return;
		
		inorder(arr, idx * 2, N);
		sb.append(arr[idx]);
		inorder(arr, idx * 2 + 1, N);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			
			// 배열로 구현된 트리
			char[] node = new char[N + 1];
			for(int i=1;i<=N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				st.nextToken();
				node[i] = st.nextToken().charAt(0);
				
				while(st.hasMoreTokens()) st.nextToken();
			}
			
			sb.append("#" + tc + " ");
			inorder(node, 1, N);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}