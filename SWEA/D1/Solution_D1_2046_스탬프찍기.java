import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_2046_스탬프찍기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int sharpOfNumber = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(0 < sharpOfNumber--) sb.append("#");
		
		System.out.print(sb.toString());
	}
}