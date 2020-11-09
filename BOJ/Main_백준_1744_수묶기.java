import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_1744_수묶기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] array = new int[N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		LinkedList<Integer> minusDeque = new LinkedList<Integer>();
		LinkedList<Integer> plusDeque = new LinkedList<Integer>();

		int zero = 0;
		for(int i=0;i<N;i++) {
			int value = array[i];
			
			if(value < 0) minusDeque.offer(value);
			if(0 < value) plusDeque.offer(value);
	
			if(value == zero) zero++;
		}
		
		int sum = 0;
		while(2 <= minusDeque.size()) {
			int value1 = minusDeque.poll();
			int value2 = minusDeque.poll();
			
			sum += value1 * value2;
		}
		
		while(!minusDeque.isEmpty()) {
			while(0 < zero--) minusDeque.poll();
			
			if(minusDeque.isEmpty()) 
				break;
			
			sum += minusDeque.poll();
		}

		while(2 <= plusDeque.size()) {
			int value1 = plusDeque.pollLast();
			int value2 = plusDeque.pollLast();
		
			if(value1 == 1 || value2 == 1) sum += (value1 + value2);
			else sum += value1 * value2;
		}
		
		while(!plusDeque.isEmpty()) sum += plusDeque.poll();
	
		System.out.print(sum);
	}
}