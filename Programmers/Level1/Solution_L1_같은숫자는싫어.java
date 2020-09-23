import java.util.ArrayList;
import java.util.Arrays;

public class Solution_L1_같은숫자는싫어 {
    public static int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int value = -1;
        for(int i=0;i<arr.length;i++){
            if(value == arr[i]) continue;
            
            value = arr[i];
            list.add(value);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++)
            answer[i] = list.get(i);
    
        return answer;
    }

    public static void main(String[] args) {
    	System.out.print(Arrays.toString(solution(new int[] { 1, 1, 3, 3, 0, 1, 1 })));
	}
}