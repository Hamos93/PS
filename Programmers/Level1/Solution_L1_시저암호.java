
public class Solution_L1_시저암호 {
	public static String solution(String s, int n) {
		char[] arr = s.toCharArray();

		for(int i=0;i<arr.length;i++){
			if(65 <= arr[i] && arr[i] <= 90){
				arr[i] += n;

				if(90 < arr[i]) {
					int value = arr[i] - 90;
					arr[i] = (char)(64 + value); 
				}
			}

			if(97 <= arr[i] && arr[i] <= 122){
				arr[i] += n;

				if(122 < arr[i]){
					int value = arr[i] - 122;
					arr[i] = (char)(96 + value);
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++)
			sb.append(arr[i]);

		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.print(solution("AB", 1));
	}
}
