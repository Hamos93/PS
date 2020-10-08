import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14659_한조서열정리하고옴ㅋㅋ {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] height = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			height[i] = Integer.parseInt(st.nextToken());
		
		int result = 0;
		for(int i=0;i<N;i++) {
			int cnt = 0;
			for(int j=i+1;j<N;j++) {
				if(height[i] < height[j]) break;
				else cnt++;
			}
			
			result = result < cnt ? cnt : result;
		}
		
		System.out.print(result);
	}
}