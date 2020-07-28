import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_6808_규영이와인영이의카드게임 {
	private static int[] cardSet1;
	private static int[] cardSet2;
	private static int[] result;
	private static boolean[] visit;
	private static int winCase, loseCase;
	
	private static void permutation(int n, int r, int depth) {
		if(depth == r) {
			play();
			
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				result[depth] = cardSet2[i];
				
				permutation(n, r, depth + 1);

				visit[i] = false;
			}
		}
	}
	
	private static void play() {
		int sum1 = 0, sum2 = 0;
		for(int i=0;i<9;i++) {
			if(result[i] < cardSet1[i]) sum1 += cardSet1[i] + result[i];
			else sum2 += cardSet1[i] + result[i];
		}
		
		if(sum2 < sum1) winCase++;
		if(sum1 < sum2) loseCase++;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			boolean[] card = new boolean[19];
			st = new StringTokenizer(br.readLine(), " ");
			
			cardSet1 = new int[9];
			for(int i=0;i<9;i++) {
				int num = Integer.parseInt(st.nextToken());
				cardSet1[i] = num;
				
				card[num] = true;
			}
			
			cardSet2 = new int[9];
			int idx = 0;
			for(int i=1;i<=18;i++)
				if(!card[i]) cardSet2[idx++] = i; 

			winCase = 0; loseCase = 0;
			
			result = new int[9];
			visit = new boolean[9];
			permutation(9, 9, 0);
		
			sb.append("#" + tc + " " + winCase + " " + loseCase + "\n");
		}
		
		System.out.print(sb.toString());
	}
}