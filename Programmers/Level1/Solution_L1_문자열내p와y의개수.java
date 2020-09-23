
public class Solution_L1_문자열내p와y의개수 {
	public static boolean solution(String s) {
		char[] arr = s.toLowerCase().toCharArray();
		int pCnt = 0, yCnt = 0;

		for(int i=0;i<arr.length;i++){
			if(arr[i] == 'p') pCnt++;
			if(arr[i] == 'y') yCnt++;
		}

		if(pCnt == 0 && yCnt == 0) return true;

		if(pCnt == yCnt) return true;
		else return false; 
	}

	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
	}
}