import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_5800_성적통계 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken());
		for(int k=1;k<=K;k++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			
			for(int i=0;i<N;i++)
				score[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(score);
			
			int gap = 0;
			for(int i=0;i<N-1;i++)
				gap = gap < score[i+1] - score[i] ? score[i+1] - score[i] : gap;
			
			sb.append("Class " + k + "\n");
			sb.append("Max " + score[N-1] + ", Min " + score[0] + ", Largest gap " + gap + "\n" );
		}
		
		System.out.print(sb.toString().trim());
	}
}