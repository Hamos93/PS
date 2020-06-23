import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1085_직사각형에서탈출 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int answer = Integer.MAX_VALUE;
		
		if((h - y) < answer) answer = (h - y);
		
		if(x < answer) answer = x;
	
		if((w - x) < answer) answer = (w - x);
	
		if(y < answer) answer = y;

		System.out.print(answer);
	}
}