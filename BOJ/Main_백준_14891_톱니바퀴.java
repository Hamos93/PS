import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_14891_톱니바퀴 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		LinkedList<Integer>[] queue = new LinkedList[5];
		for(int i=0;i<=4;i++)
			queue[i] = new LinkedList<Integer>();
		
		for(int i=1;i<=4;i++) {
			String input = br.readLine();
			for(int j=0;j<8;j++)
				queue[i].offer(input.charAt(j) - '0');
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());

		while(0 < K--) {
			st = new StringTokenizer(br.readLine(), " ");
	
			int num = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
		
			int[] flag = new int[5];
			flag[num] = dir;
			
			int left = queue[num].get(6);
			int leftDir = dir;
			for(int i=num-1;1<=i;i--) {
				if(queue[i].get(2) != left) {
					if(leftDir == 1) flag[i] = -1;
					else flag[i] = 1;
					
					left = queue[i].get(6);
					leftDir = flag[i];
				}else break;
			}
			
			int right = queue[num].get(2);
			int rightDir = dir;
			for(int i=num+1;i<=4;i++) {
				if(queue[i].get(6) != right) {
					if(rightDir == 1) flag[i] = -1;
					else flag[i] = 1;
					
					right = queue[i].get(2);
					rightDir = flag[i];
				}else break;
			}
		
			for(int i=1;i<=4;i++) {
				if(flag[i] == 1) queue[i].offerFirst((queue[i].pollLast()));
				if(flag[i] == -1) queue[i].offer(queue[i].pollFirst());
			}
		}
		
		int result = 0;
		for(int i=1;i<=4;i++) {
			int value = queue[i].peekFirst();
		
			if(value == 0) continue;
			result += (int) Math.pow(2, i-1);
		}
		
		System.out.print(result);
	}
}