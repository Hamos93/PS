
public class Solution_L1_콜라츠추측 {
	public static int solution(long num) {
		int cnt = 0;

		while(true){
			if(cnt == 500 && num != 1) {
				cnt = -1;
				break;
			}

			if(num == 1) break;

			if(num % 2 == 0) num /= 2;
			else {
				num *= 3;
				num += 1;
			}

			cnt++;
		}

		return cnt;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(626331));
	}
}