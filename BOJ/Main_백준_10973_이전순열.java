import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10973_이전순열 {
	private static int[] data;
	
	private static void swap(int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	private static boolean nextPermutation(int n) {
		int i = n - 1;
		while(0 < i && data[i-1] <= data[i]) i--;
		if(i <= 0) return false;
		
		int j = n - 1;
		while(data[i-1] <= data[j]) j--;
		
		swap(i-1, j);
		
		j = n - 1;
		while(i < j) {
			swap(i, j);
			i++; j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		data = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			data[i] = Integer.parseInt(st.nextToken());
		
		if(nextPermutation(N)) {
			for(int i=0;i<N;i++) {
				if(i == N-1) System.out.print(data[i]);
				else System.out.print(data[i] + " ");
			}
		}else System.out.print("-1");
	}
}