import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_16198_에너지모으기 {
	private static List<Integer> W;
	private static int energy;

	public static void dfs(int N, int S) {
		if(N == 2) {
			energy = Math.max(energy, S);
			return;
		}
		
		for(int i=1;i<W.size()-1;i++) {
			int value = W.get(i-1) * W.get(i+1);
			int X = W.get(i);
			
			W.remove(i);
			
			dfs(N-1, S + value);
			
			W.add(i, X);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		W = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			W.add(Integer.parseInt(st.nextToken()));
		
		energy = 0;
		dfs(N, 0);

		System.out.print(energy);
	}
}