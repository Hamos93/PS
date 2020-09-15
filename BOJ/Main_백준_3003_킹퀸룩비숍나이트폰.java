import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_3003_킹퀸룩비숍나이트폰 {
	public static void main(String[] args) throws Exception {
		int[] chess = { 1, 1, 2, 2, 2, 8 };
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] white = new int[6];
		for(int i=0;i<6;i++) {
			white[i] = chess[i] - Integer.parseInt(st.nextToken());
			System.out.print(white[i] + " ");
		}
	}
}