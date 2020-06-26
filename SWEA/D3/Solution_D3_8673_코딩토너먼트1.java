import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_8673_코딩토너먼트1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int K = Integer.parseInt(st.nextToken());
			
			int[] skill = new int[(int)(Math.pow(2, K))];
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<skill.length;i++)
				skill[i] = Integer.parseInt(st.nextToken());
			
			int round = 1, answer = 0;
			while(round <= K) {
				int cnt = (int)(Math.pow(2, round));
		
				for(int i=0;i<skill.length;i+=cnt) {
					answer += Math.abs(skill[i] - skill[i + (cnt/2)]);
					
					if(skill[i] < skill[i + (cnt/2)]) {
						int temp = skill[i];
						skill[i] = skill[i + (cnt/2)];
						skill[i + (cnt/2)] = temp;
					}
				}
				
				round++;
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}