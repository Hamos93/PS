import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1209_Sum {
	private static final int NUM = 100;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int T = Integer.parseInt(st.nextToken());

			int[][] arr = new int[NUM][NUM];
			for(int i=0;i<NUM;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<NUM;j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			for(int i=0;i<NUM;i++) {
				int sum = 0;
				for(int j=0;j<NUM;j++)
					sum += arr[i][j];
				
				answer = answer < sum ? sum : answer;
			}
			
			for(int j=0;j<NUM;j++) {
				int sum = 0;
				for(int i=0;i<NUM;i++)
					sum += arr[i][j];
				
				answer = answer < sum ? sum : answer;
			}
			
			int leftSum = 0, rightSum = 0;
			for(int i=0;i<NUM;i++) {
				leftSum += arr[i][i];
				rightSum += arr[i][99 - i];
			}
			
			if(leftSum < rightSum) answer = answer < rightSum ? rightSum : answer; 
			else answer = answer < leftSum ? leftSum : answer;
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}