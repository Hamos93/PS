import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_2164_카드2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++)
			queue.offer(i);
		
		while(true){
			if(queue.size() == 1) {
				System.out.print(queue.poll());
				return;
			}
		
			queue.poll();
			queue.offer(queue.poll());
		}
	}
}