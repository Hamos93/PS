import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D2_1984_중간평균값구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double[] array = new double[10];
			double sum = 0;
			for(int i=0;i<10;i++) {
				array[i] = Integer.parseInt(st.nextToken());
				sum += array[i];
			}
			
			Arrays.sort(array);
			sum -= array[0] + array[9];
			
			sb.append("#" + tc + " " + (int)(Math.round(sum / 8)) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}