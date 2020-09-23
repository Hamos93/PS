
public class Solution_L1_두정수사이의합 {
	public static long solution(int a, int b) {
		if(a == b) return a;

		if(b < a){
			int temp = a;
			a = b;
			b = temp;
		}

		long answer = 0;
		for(int i=a;i<=b;i++)
			answer += i;

		return answer;
	}

	public static void main(String[] args) {
		System.out.print(solution(5, 3));
	}
}