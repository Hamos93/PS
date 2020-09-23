
public class Solution_L1_2016년 {
	public static String solution(int a, int b) {
		int[] month = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

		int result = 0;
		if(a == 1){
			result = (b - 1) % 7;
			return day[result];
		}

		for(int i=1;i<a;i++)
			result += month[i];

		result += b - 1;
		result %= 7;

		return day[result];
	}

	public static void main(String[] args) {
		System.out.print(solution(5, 24));
	}
}