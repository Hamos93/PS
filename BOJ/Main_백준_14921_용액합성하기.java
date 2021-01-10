import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14921_용액합성하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] water = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			water[i] = Integer.parseInt(st.nextToken());
		
		int low = 0, high = N-1;
		int answer = water[low] + water[high];
		while(low < high) {
			int value1 = Math.abs(water[low + 1] + water[high]);
			int value2 = Math.abs(water[low] + water[high - 1]);
		
			if(value1 <= value2) {
				low++;
				
				if(low == high) break;
				
				if(Math.abs(value1) < Math.abs(answer)) 
					answer = water[low] + water[high];
			}
			else {
				high--;

				if(low == high) break;
				
				if(Math.abs(value2) < Math.abs(answer)) 
					answer = water[low] + water[high];
			}
		}
		
		System.out.print(answer);
	}
}