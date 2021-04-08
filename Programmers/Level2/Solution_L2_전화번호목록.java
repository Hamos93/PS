import java.util.Arrays;

public class Solution_L2_전화번호목록 {
	public static boolean solution(String[] phone_book) {
		Arrays.sort(phone_book);
		
		for(int i=0;i<phone_book.length;i++) {
			if(i == 0) continue;
			if(phone_book[i].indexOf(phone_book[i-1]) == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new String[] { "119", "97674223", "1195524421" }));
		System.out.println(solution(new String[] { "123", "456", "789" }));
		System.out.println(solution(new String[] { "12", "123", "1235", "567, 88" }));
		System.out.println(solution(new String[] { "112", "44", "4544" }));
	}
}