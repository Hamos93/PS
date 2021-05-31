import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_21866_추첨을통해커피를받자 {
	public static void main(String[] args) throws Exception {
		int[] score = { 100, 100, 200, 200, 300, 300, 400, 400, 500 };
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] arr = new int[9];
		int sum = 0; boolean isHacker = false;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] > score[i]) 
				isHacker = true;
			
			sum += arr[i];
		}
		
		if(isHacker) System.out.print("hacker");
		else if(100 <= sum) System.out.print("draw");
		else System.out.print("none");
	}
}