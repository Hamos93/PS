import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_19949_영재의시험 {
	private static int[] answer;
	private static int[] OMR;
	private static boolean[] visit;
	private static int cnt;
	private static final int[] SELECTION = { 1, 2, 3, 4, 5 };
	
	public static void permutation(int idx) {
		if(idx == 10) {
			int score = 0;
			for(int i=0;i<10;i++) {
				if(OMR[i] == answer[i]) score++;
			}
			
			if(5 <= score) cnt++;
				
			return;
		}
		
		for(int i=0;i<5;i++) {
			visit[idx] = true;
			
			if(1 < idx) {
				if(OMR[idx - 2] == OMR[idx - 1] && OMR[idx - 1] == SELECTION[i]) 
					continue;
			}
			
			OMR[idx] = SELECTION[i];
			
			permutation(idx + 1);
			
			visit[idx] = false;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		answer = new int[10];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<10;i++)
			answer[i] = Integer.parseInt(st.nextToken());
		
		OMR = new int[10];
		visit = new boolean[10];
		
		cnt = 0;
		permutation(0);
		
		System.out.print(cnt);
	}
}