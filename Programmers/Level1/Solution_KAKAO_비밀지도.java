import java.util.Arrays;

public class Solution_KAKAO_비밀지도 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
    	String[] binary1 = new String[n];
    	String[] binary2 = new String[n];
    	
    	for(int i=0;i<n;i++) {
    		String value1 = Integer.toBinaryString(arr1[i]); 
    		String value2 = Integer.toBinaryString(arr2[i]);
    		
    		while(value1.length() < n) value1 = "0" + value1;
    		while(value2.length() < n) value2 = "0" + value2;
    	
    		binary1[i] = value1;
    		binary2[i] = value2;
    	}
    	
    	String[] answer = new String[n];
    	for(int i=0;i<n;i++) {
    		String result = "";
    		for(int j=0;j<n;j++) {
    			if(binary1[i].charAt(j) - '0' == 1 || binary2[i].charAt(j) - '0' == 1) result += "#";
    			if(binary1[i].charAt(j) - '0' == 0 && binary2[i].charAt(j) - '0' == 0) result += " ";
    		}
    		
    		answer[i] = result;
    	}

    	return answer;
    }
    
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 })));
	}
}