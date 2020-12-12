import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_3723_두수의합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++)
			array[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		
		Arrays.sort(array);
		
		int i = 0, j = n - 1, sum = 0;
		int cnt = 0;
		while(i < j) {
			sum = array[i] + array[j];
		
			if(sum < x) i++;
			else if(x < sum) j--;
			else {
				cnt++;
				
				i++;
				j--;
			}
		}

		System.out.println(cnt);
	}
}