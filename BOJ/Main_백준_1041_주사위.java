import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_1041_주사위 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] dice = new int[6];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<6;i++)
			dice[i] = Integer.parseInt(st.nextToken());
		
		if(N == 1) {
			int result = 0, max = 0;
			
			for(int i=0;i<6;i++) {
				result += dice[i];
				max = max < dice[i] ? dice[i] : max;
			}
			
			result -= max;
			System.out.print(result);
		
			return;
		}
		
		int[] value = new int[3];
		for(int i=0;i<3;i++)
			value[i] = dice[i] < dice[5 - i] ? dice[i] : dice[5 - i]; 
			
		Arrays.sort(value);

		long top = 0;
		top += (value[0] + value[1] + value[2]) * 4;
		top += ((value[0] + value[1]) * ((N - 2) * 4));
		top += (value[0] * ((long)(N - 2) * (N - 2)));
		
		long bottom = 0;
		bottom += ((value[0] + value[1]) * 4);
		bottom += (value[0] * ((N - 2) * 4));

		bottom *= (N - 1);
		
		System.out.print(top + bottom);
	}
}