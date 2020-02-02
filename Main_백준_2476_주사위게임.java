import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2476_주사위게임 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int answer = 0;

		while(N-- > 0){
			int[] dice = new int[7];

			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) dice[Integer.parseInt(st.nextToken())]++;

			int result = 0;
			boolean flag = false;

			for(int i=1;i<=6;i++){
				if(dice[i] == 3){
					result = 10000 + i * 1000;
					flag = true;
					break;
				}

				if(dice[i] == 2){
					result = 1000 + i * 100;
					flag = true;
					break;
				}
			}
			
			if(!flag){
				for(int i=6;1<=i;i--){
					if(dice[i] != 0){
						result = i * 100;
						break;
					}
				}
			}
			
			answer = answer < result ? result : answer;
		}
		
		System.out.print(answer);
	}
}