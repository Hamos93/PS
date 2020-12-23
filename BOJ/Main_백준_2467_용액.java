import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2467_용액 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] water = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			water[i] = Integer.parseInt(st.nextToken());
		
		int start = 0, end = N-1, value = 0;
		int water1 = 0, water2 = 0, result = Integer.MAX_VALUE;
		while(start < end) {
			value = water[start] + water[end];
		
			if(Math.abs(value) < result) {
				result = Math.abs(value);
				
				water1 = water[start];
				water2 = water[end];
			}
		
			
			if(Math.abs(water[start + 1] + water[end]) <= Math.abs(water[start] + water[end - 1])) start++;
			else end--;
		}
		
		System.out.print(water1 + " " + water2);
	}
}