import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2455_지능형기차 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int result = 0;
		int answer = 0;
		for(int i=0;i<4;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			int down = Integer.parseInt(st.nextToken());
			int up = Integer.parseInt(st.nextToken());
			
			result -= down;
			result += up;
			
			if(answer < result) answer = result;
		}
	
		System.out.print(answer);
	}
}