import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2477_참외밭 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken());
		int[] len = new int[6];
		
		int width = 0, height = 0;
		for(int i=0;i<6;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int dir = Integer.parseInt(st.nextToken());
			len[i] = Integer.parseInt(st.nextToken());
			
			if((dir == 1 || dir == 2) && (width < len[i])) width = len[i];
			if((dir == 3 || dir == 4) && (height < len[i])) height = len[i];
		}

		int w = 0, h = 0;
		for(int i=0;i<6;i++) {
			if(width == len[(i + 5) % 6] + len[(i + 1) % 6]) h = len[i];
			if(height == len[(i + 5) % 6] + len[(i + 1) % 6]) w = len[i];
		}
		
		int melon = ((width * height) - (w * h)) * K;
		System.out.print(melon);
	}
}