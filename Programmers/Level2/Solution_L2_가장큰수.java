import java.util.Arrays;
import java.util.Comparator;

public class Solution_L2_가장큰수 {
	public static String solution(int[] numbers) {
		String[] num = new String[numbers.length];
		for(int i=0;i<num.length;i++)
			num[i] = Integer.toString(numbers[i]);
	
		// 정렬 기준 재정의
		Arrays.sort(num, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});
		
		if(num[0].equals("0")) return "0";

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num.length;i++)
			sb.append(num[i]);
		
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.print(solution(new int[] { 3, 30, 34, 5, 9 }));
	}
}