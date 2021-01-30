import java.util.Arrays;

public class Solution_L2_카펫 {
    public static int[] solution(int brown, int yellow) {
    	int[] answer = new int[2];
    	
    	int grid = brown + yellow;
    	int col = 1;
    	
    	while(true) {
    		if(grid % col == 0) {
    			int row = grid / col;
    			
    			if((row - 2) * (col - 2) == yellow){
    				answer[0] = row;
    				answer[1] = col;
    				
    				break;
    			}
    		}
    		
    		col++;
    	}
        
        return answer;
    }
    
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10, 2)));
		System.out.println(Arrays.toString(solution(8, 1)));
		System.out.println(Arrays.toString(solution(24, 24)));
	}
}