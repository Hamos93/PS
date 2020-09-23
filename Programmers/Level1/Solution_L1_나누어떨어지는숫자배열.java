import java.util.ArrayList;
import java.util.Arrays;

public class Solution_L1_나누어떨어지는숫자배열 {
    public static int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        
        if(list.size() == 0){
            int[] answer = { -1 };
            return answer;
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++)
            answer[i] = list.get(i);

        return answer;
    }

    public static void main(String[] args) {
    	System.out.print(Arrays.toString(solution(new int[] { 5, 9, 7, 10 }, 5)));
	}
}