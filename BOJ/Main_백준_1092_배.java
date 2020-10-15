import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_1092_배 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		List<Integer> crane = new ArrayList<>();

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			int weight = Integer.parseInt(st.nextToken());
			crane.add(weight);
		}

		st = new StringTokenizer(br.readLine(), " ");

		int M = Integer.parseInt(st.nextToken());
		List<Integer> box = new ArrayList<>();

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<M;i++) {
			int weight = Integer.parseInt(st.nextToken());
			box.add(weight);
		}

		Collections.sort(crane, Collections.reverseOrder());
		Collections.sort(box, Collections.reverseOrder());

		if(crane.get(0) < box.get(0)) {
			System.out.print("-1");
			return;
		}
		
		int cnt = 0;
		while(!box.isEmpty()) {
			int cIdx = 0, bIdx = 0;
			
			while(cIdx < N) {
				if(bIdx == box.size()) break;
				
				if(box.get(bIdx) <= crane.get(cIdx)) {
					box.remove(bIdx);
					cIdx++;
				}else bIdx++;
			}
			
			cnt++;
		}
		
		System.out.print(cnt);
	}
}