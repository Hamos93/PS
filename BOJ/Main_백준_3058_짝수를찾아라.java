import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_3058_짝수를찾아라 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int sum = 0, min = Integer.MAX_VALUE;
			while(st.hasMoreTokens()){
				int value = Integer.parseInt(st.nextToken());
			
				if(value % 2 == 0) sum += value;
				if(value % 2 == 0 && value < min) min = value;
			}
			
			System.out.println(sum + " " + min);
		}
	}
}