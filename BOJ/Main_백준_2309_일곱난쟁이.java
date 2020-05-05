import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2309_일곱난쟁이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int[] height = new int[9];
		int sum = 0;
		for(int i=0;i<9;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			height[i] = Integer.parseInt(st.nextToken());
			sum += height[i];
		}
		
		Arrays.sort(height);
		
		int idx1 = 0, idx2 = 0;
		loop: for(int i=0;i<9;i++){
			for(int j=i+1;j<9;j++){
				if(sum - height[i] - height[j] == 100){
					idx1 = i;
					idx2 = j;
					
					break loop;
				}
			}
		}
		
		for(int i=0;i<9;i++){
			if(i == idx1 || i == idx2) continue;
			System.out.println(height[i]);
		}
	}
}