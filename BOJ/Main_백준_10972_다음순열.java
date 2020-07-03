import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10972_다음순열 {
	private static int[] data;
	
	private static void swap(int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	private static boolean nextPermutation(int n) {
		// 1. A[i - 1] < A[i]를 만족하는 가장 큰 i 찾기
		int i = n - 1;
		while(0 < i && data[i] <= data[i-1]) i--;
		if(i <= 0) return false; // 마지막 순열인 경우
		
		// 2. A[i - 1] < A[j]를 만족하는 가장 큰 j 찾기
		int j = n - 1;
		while(data[j] <= data[i-1]) j--;
		
		// 3. swap(A[i-1], A[j])
		swap(i-1, j);
		
		// 4. A[i]부터 순열 뒤집기
		j = n - 1;
		while(i < j) {
			swap(i, j);
			i++; j--;
		}
		
		return true; // 다음순열이 존재하는 경우
	
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