import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_1713_후보추천하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int recommend = Integer.parseInt(st.nextToken());

		LinkedList<int[]> queue = new LinkedList<>();
		st = new StringTokenizer(br.readLine(), " ");
		loop: while(0 < recommend--) {
			int no = Integer.parseInt(st.nextToken());

			if(queue.size() == N) {
				for(int i=0;i<queue.size();i++) {
					if(queue.get(i)[0] == no) {
						queue.get(i)[1]++;

						continue loop;
					}
				}

				int min = Integer.MAX_VALUE;

				for(int i=0;i<queue.size();i++)
					if(queue.get(i)[1] < min) min = queue.get(i)[1];

				int idx = 0, cnt = 0;
				for(int i=0;i<queue.size();i++) {
					if(queue.get(i)[1] == min) {
						idx = i;
						cnt++;
					}
				}

				if(1 < cnt) {
					for(int i=0;i<queue.size();i++) {
						if(queue.get(i)[1] == min) {
							queue.remove(i);
							break;
						}
					}
				}else queue.remove(idx);
			}

			boolean flag = false;

			for(int i=0;i<queue.size();i++) {
				if(queue.get(i)[0] == no) {
					queue.get(i)[1]++;
					flag = true;

					break;
				}
			}
			if(!flag) queue.offer(new int[] { no, 1 });
		}


		Collections.sort(queue, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] < o2[0]) return -1;

				return 0;
			}
		});

		for(int i=0;i<queue.size();i++)
			System.out.print(queue.get(i)[0] + " ");
	}
}