import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2776_암기왕 {
	public static int binarySearch(int[] array, int target, int start, int end) {
		if(end < start) return -1;
		
		int mid = (start + end) / 2;
		
		if(array[mid] == target) return mid;
		if(target < array[mid]) return binarySearch(array, target, start, mid - 1);
		if(array[mid] < target) return binarySearch(array, target, mid + 1, end);
		
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] array = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				array[i] = Integer.parseInt(st.nextToken());
		
			Arrays.sort(array);
		
			st = new StringTokenizer(br.readLine(), " ");
			int M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				int value = Integer.parseInt(st.nextToken());
				
				int idx = binarySearch(array, value, 0, N - 1);
				
				if(idx == -1) sb.append("0\n");
				else sb.append("1\n");
			}
		}
		
		System.out.print(sb.toString().trim());
	}
}