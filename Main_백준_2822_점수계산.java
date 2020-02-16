import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2822_점수계산 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		List<int[]> list = new ArrayList<>();
		for(int i=1;i<=8;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			list.add(new int[]{i, Integer.parseInt(st.nextToken())});
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] < o2[1]) return 1;
				
				return -1;
			}
		});
		
		int answer = 0;
		int[] idx = new int[5];
		for(int i=0;i<5;i++){
			answer += list.get(i)[1];
			idx[i] = list.get(i)[0];
		}
		
		Arrays.sort(idx);
		
		System.out.println(answer);
		for(int i=0;i<5;i++)
			System.out.print(idx[i] + " ");
	}
}