import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2470_두용액 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int[] solution = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			solution[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(solution);
		
		int start = 0, end = N-1, answer = Integer.MAX_VALUE;
		int solution1 = 0, solution2 = 0;
		while(start < end) {
			int result = Math.abs(solution[start] + solution[end]);
			
			if(result < answer) {
				answer = result;

				solution1 = solution[start];
				solution2 = solution[end];
			}
			
			int next1 = Math.abs(solution[start] + solution[end - 1]);
			int next2 = Math.abs(solution[start + 1] + solution[end]);
			
			if(next1 <= next2) end--;
			else start++;
		}
		
		System.out.print(solution1 + " " + solution2);
	}
}