import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11004_K번째수 {
	private static int N;
	private static int[] data;
	private static int[] result;

	public static void mergeSort(int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			
			mergeSort(left, mid);
			mergeSort(mid + 1, right);
			merge(left, mid, right);
		}
	}
	
	public static void merge(int left, int mid, int right) {
		int i = left, j = mid + 1, k = left;
		
		while(i <= mid && j <= right) {
			if(data[i] <= data[j]) result[k++] = data[i++];
			else result[k++] = data[j++];
		}
		
		if(mid < i) {
			for(int idx=j;idx<=right;idx++)
				result[k++] = data[idx];
		}else {
			for(int idx=i;idx<=mid;idx++)
				result[k++] = data[idx];
		}
		
		for(int idx=left;idx<=right;idx++)
			data[idx] = result[idx];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		data = new int[N];
		result = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			data[i] = Integer.parseInt(st.nextToken());
		
		mergeSort(0, N-1);
		
		System.out.print(data[K - 1]);
	}
}