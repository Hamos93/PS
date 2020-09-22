import java.util.Arrays;

public class Solution_L1_정수내림차순으로배치하기 {
    public static long solution(long n) {
       	char[] num = Long.toString(n).toCharArray();
        Arrays.sort(num);
 
        String result = "";
        for(int i=num.length-1;0<=i;i--)
            result += num[i];
        
        return Long.parseLong(result);
    }
    
	public static void main(String[] args) {
		System.out.print(solution(118372));
	}
}