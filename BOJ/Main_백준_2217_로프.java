import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_백준_2217_로프 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());

		ArrayList<Integer> rope = new ArrayList<>(); 
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int value = Integer.parseInt(st.nextToken());
			rope.add(value);
		}

		Collections.sort(rope, Collections.reverseOrder());
		
		int maxWeight = 0, cnt = 1, size = rope.size();
		for(int i=0;i<size;i++) {
			int weight = rope.get(i) * cnt;
			cnt++;
			
			maxWeight = maxWeight < weight ? weight : maxWeight;
		}
		
		System.out.print(maxWeight);
	}
}