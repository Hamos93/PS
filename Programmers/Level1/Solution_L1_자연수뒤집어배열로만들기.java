import java.util.Arrays;

public class Solution_L1_자연수뒤집어배열로만들기 {
    public static int[] solution(long n) {
		StringBuilder sb = new StringBuilder();
		String str = sb.append(n).reverse().toString();
		
		int[] arr = new int[str.length()];
		for(int i=0;i<arr.length;i++)
			arr[i] = str.charAt(i) - '0';

        return arr;
    }
    
	public static void main(String[] args) {
		System.out.print(Arrays.toString(solution(12345)));
	}
}