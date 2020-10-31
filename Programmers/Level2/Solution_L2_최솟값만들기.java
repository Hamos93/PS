import java.util.Arrays;

public class Solution_L2_최솟값만들기 {
    public static int solution(int []A, int []B){
    	Arrays.sort(A);
    	Arrays.sort(B);
    	
    	int answer = 0, len = A.length;
    	for(int i=0;i<len;i++)
    		answer += A[i] * B[len - 1 - i];
        return answer;
    }

    public static void main(String[] args) {
    	System.out.println(solution(new int[] { 1, 4, 2 }, new int[] { 5, 4, 4 }));
	}
}