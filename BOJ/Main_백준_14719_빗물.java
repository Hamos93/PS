import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14719_빗물 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		int[] arr = new int[W];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<W;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int left = 0, right = 0, result = 0;
		for(int i=1;i<=W-2;i++) {
			left = 0; right = 0;
			
			for(int j=0;j<i;j++)
				left = Math.max(left, arr[j]);
			
			for(int j=i+1;j<W;j++)
				right = Math.max(right, arr[j]);
			
			if(arr[i] < left && arr[i] < right)
				result += Math.min(left, right) - arr[i];
		}
		
		System.out.print(result);
	}
}