import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14681_사분면고르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int y = Integer.parseInt(st.nextToken());
	
		if(0 < x && 0 < y) System.out.print("1");
		else if(x < 0 && 0 < y) System.out.print("2");
		else if(x < 0 && y < 0) System.out.print("3");
		else System.out.print("4");
	}
}