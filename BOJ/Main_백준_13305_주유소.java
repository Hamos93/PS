import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13305_주유소 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		long[] distance = new long[N-1];
		long[] oil = new long[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N-1;i++)
			distance[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			oil[i] = Integer.parseInt(st.nextToken());

		long price = distance[0] * oil[0];
		int cur = 0, next = 1;
		while(next < N-1) {
			if(oil[cur] < oil[next]) price += oil[cur] * distance[next];
			else {
				price += oil[next] * distance[next];
				cur = next;
			}
			
			next++;
		}
		
		System.out.print(price);
	}
}