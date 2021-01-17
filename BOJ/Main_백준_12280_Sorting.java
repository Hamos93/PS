import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_12280_Sorting {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			
			PriorityQueue<Integer> odd = new PriorityQueue<Integer>();
			PriorityQueue<Integer> even = new PriorityQueue<Integer>(Collections.reverseOrder());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++) {
				int value = Integer.parseInt(st.nextToken());
				
				if(Math.abs(value) % 2 == 1) {
					arr[i] = 1;
					odd.offer(value);
				}else even.offer(value);
			}
			
			sb.append("Case #" + tc + ": ");
			for(int i=0;i<N;i++) {
				if(arr[i] % 2 == 1) sb.append(odd.poll() + " ");
				else sb.append(even.poll() + " ");
			}

			sb.append("\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}