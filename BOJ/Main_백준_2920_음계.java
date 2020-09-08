import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2920_음계 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] sound = new int[8];
		for(int i=0;i<8;i++)
			sound[i] = Integer.parseInt(st.nextToken());

		int result = sound[1] - sound[0];
		for(int i=2;i<8;i++) {
			if(sound[i] - sound[i-1] != result) {
				System.out.print("mixed");
				return;
			}
		}
		
		if(0 < result) System.out.print("ascending");
		else System.out.println("descending");
	}
}