package Backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_1759_암호만들기 {
	private static char[] data;
	private static char[] res;
	private static boolean[] visit;
	private static StringBuilder sb;

	private static void combination(int n, int r, int depth, int start){
		if(depth == r){
			// 모음, 자음의 개수
			int cnt1 = 0, cnt2 = 0;

			for(int i=0;i<r;i++){
				if(res[i] == 'a' || res[i] == 'e' || res[i] == 'i' || res[i] == 'o' || res[i] == 'u') cnt1++;
				else cnt2++;
			}

			if(1 <= cnt1 && 2 <= cnt2) {
				for(int i=0;i<r;i++)
					sb.append(res[i]);
				sb.append("\n");
			}

			return;
		}

		for(int i=start;i<n;i++){
			if(!visit[i]){
				visit[i] = true;
				res[depth] = data[i];

				combination(n, r, depth + 1, i);

				visit[i] = false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		data = new char[C];
		res = new char[L];
		visit = new boolean[C];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<C;i++)
			data[i] = st.nextToken().charAt(0);

		Arrays.sort(data);

		sb = new StringBuilder();
		combination(C, L, 0, 0);

		System.out.print(sb.toString());
	}
}