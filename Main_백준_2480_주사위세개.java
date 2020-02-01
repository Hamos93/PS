import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2480_주사위세개 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] dice = new int[7];

		while(st.hasMoreTokens()) dice[Integer.parseInt(st.nextToken())]++;

		for(int i=1;i<=6;i++){
			if(dice[i] == 3){
				System.out.print(10000 + i * 1000);
				return;
			}

			if(dice[i] == 2){
				System.out.print(1000 + i * 100);
				return;
			}
		}

		for(int i=6;1<=i;i--)
			if(dice[i] != 0) {
				System.out.println(i * 100);
				return;
			}
	}
}