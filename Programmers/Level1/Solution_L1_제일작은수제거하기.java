import java.util.ArrayList;
import java.util.Arrays;

public class Solution_L1_제일작은수제거하기 {
	  public static int[] solution(int[] arr) {
		  if(arr.length == 1) {
			  int[] answer = new int[] { -1 };
			  return answer;
		  }
		  
		  int min = Integer.MAX_VALUE, idx = 0;
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i] < min) {
				  min = arr[i];
				  idx = i;
			  }
		  }
		  
		  ArrayList<Integer> list = new ArrayList<>();
		  for(int i=0;i<arr.length;i++) {
			  if(i == idx) continue;
			  list.add(arr[i]);
		  }
		  
		  int[] answer = new int[arr.length - 1];
		  for(int i=0;i<answer.length;i++)
			  answer[i] = list.get(i);
		  
		  return answer;
	  }	
		  
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 4, 3, 2, 1 })));
	}
}
