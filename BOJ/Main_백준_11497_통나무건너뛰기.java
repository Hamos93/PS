import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_11497_통나무건너뛰기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());

			int[] height = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				height[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(height);
			
			List<Integer> list = new ArrayList<>();
			Stack<Integer> stack = new Stack<>();
			
			for(int i=0;i<N;i++) {
				if(i % 2 == 0) list.add(height[i]);
				else stack.add(height[i]);
			}
			
			while(!stack.isEmpty()) list.add(stack.pop());
		
			int difficulty = Math.abs(list.get(list.size() - 1) - list.get(0));
			for(int i=1;i<list.size();i++) {
				int value = Math.abs(list.get(i) - list.get(i - 1));
				
				difficulty = difficulty < value ? value : difficulty;
			}
			
			System.out.println(difficulty);
		}
	}
}