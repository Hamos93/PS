import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_9076_점수집계 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			int[] score = new int[5];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<5;i++)
				score[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(score);

			if(4 <= score[3] - score[1]) System.out.println("KIN");
			else System.out.println(score[1] + score[2] + score[3]);
		}
	}
}