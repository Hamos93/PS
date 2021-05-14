import java.util.Arrays;

public class Solution_L2_2개이하로다른비트 {
	public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for(int i=0;i<numbers.length;i++) {
        	String binary = Long.toBinaryString(numbers[i]);
        	
        	if(binary.indexOf('0') == -1) {
        		binary = "10" + binary.substring(1);

        		long result = 0;
        		for(int k=0;k<binary.length();k++) {
        			if(binary.charAt(k) - '0' == 1)
        				result += Math.pow(2, binary.length() - k - 1);
        		}
   
        		answer[i] = result;
        	}else {
        		char[] arr = binary.toCharArray();
        		int idx = binary.lastIndexOf('0');
        		
        		if(idx == binary.length() - 1) arr[idx] = '1';
        		else {
        			arr[idx] = '1';
        			arr[idx + 1] = '0';
        		}

          		long result = 0;
        		for(int k=0;k<arr.length;k++) {
        			if(arr[k] - '0' == 1)
        				result += Math.pow(2, arr.length - k - 1);
        		}
        		
        		answer[i] = result;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new long[] { 2, 7 })));
	}
}