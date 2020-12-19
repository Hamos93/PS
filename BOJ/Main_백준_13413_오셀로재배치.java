import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13413_오셀로재배치 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			char[] input1 = br.readLine().toCharArray();
			char[] input2 = br.readLine().toCharArray();
			
			int W = 0, B = 0;
			for(int i=0;i<N;i++) {
				if(input1[i] != input2[i]) {
					if(input1[i] == 'W') W++;
					else B++;
				}
			}
			
			int result = Math.min(W, B);
	
			if(W <= B) result += (B - W);
			else result += (W - B);

			System.out.println(result);
		}
	}
}