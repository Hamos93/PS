import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_2116_주사위쌓기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int[][] dice = new int[N][6];

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<6;j++)
				dice[i][j] = Integer.parseInt(st.nextToken());
		}

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { 0, 5 });
		queue.offer(new int[] { 1, 3 });
		queue.offer(new int[] { 2, 4 });
		queue.offer(new int[] { 5, 0 });
		queue.offer(new int[] { 3, 1 });
		queue.offer(new int[] { 4, 2 });
		
		int answer = 0;
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int top = poll[0];
			int down = poll[1];
			
			int sum = 0, max = 0;
			for(int i=0;i<6;i++)
				if(i != top && i != down && max < dice[0][i]) max = dice[0][i];
			
			sum += max;
			for(int i=1;i<N;i++) {
				for(int idx=0;idx<6;idx++) {
					if(dice[i][idx] == dice[i-1][top]) {
						down = idx;
						break;
					}
				}
				
				switch (down) {
				case 0:
					top = 5;
					break;
				case 1:
					top = 3;
					break;
				case 2:
					top = 4;
					break;
				case 3:
					top = 1;
					break;
				case 4:
					top = 2;
					break;
				case 5:
					top = 0;
					break;
				}
				
				max = 0;
				for(int j=0;j<6;j++)
					if(j != top && j != down && max < dice[i][j]) max = dice[i][j];
			
				sum += max;
				answer = answer < sum ? sum : answer;
			}
		}
		
		System.out.print(answer);
	}
}