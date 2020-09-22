import java.util.Arrays;
import java.util.Scanner;

public class Solution_L1_x만큼간격이있는n개의숫자 {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long value = x;
  
        for(int i=0;i<n;i++){
            answer[i] = value;
            value += x;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		long[] answer = solution(x, n);
		System.out.println(Arrays.toString(answer));
	}
}