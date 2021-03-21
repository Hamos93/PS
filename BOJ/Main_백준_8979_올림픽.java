import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Nation implements Comparable<Nation>{
	int idx;
	int gold;
	int silver;
	int bronze;

	public Nation(int idx, int gold, int silver, int bronze) {
		this.idx = idx;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}

	@Override
	public int compareTo(Nation o) {
		if(this.gold > o.gold) return -1;
		else if(this.gold == o.gold) {
			if(this.silver > o.silver) return -1;
			else if(this.silver == o.silver) {
				if(this.bronze > o.bronze) return -1;
				else if(this.bronze == o.bronze) return 0;
			}
		}
	
		return 1;
	}
}

public class Main_백준_8979_올림픽 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		List<Nation> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int idx = Integer.parseInt(st.nextToken());
			int gold = Integer.parseInt(st.nextToken());
			int silver = Integer.parseInt(st.nextToken());
			int bronze = Integer.parseInt(st.nextToken());

			list.add(new Nation(idx, gold, silver, bronze));
		}

		Collections.sort(list);

		int idx = 0;
		for(int i=0;i<N;i++) {
			if(list.get(i).idx == K) {
				idx = i;

				break;
			}
		}

		int rank = 1;
		for(int i=0;i<idx;i++) {
			if(list.get(idx).gold == list.get(i).gold     &&
					list.get(idx).silver == list.get(i).silver &&
					list.get(idx).bronze == list.get(i).bronze) continue;

			rank++;
		}

		System.out.print(rank);
	}
}