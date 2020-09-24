
public class Solution_L1_체육복 {
	public static int solution(int n, int[] lost, int[] reserve) {
		// 여벌 체육복을 가져온 학생이 도난당한 경우
		int cnt1 = 0;
		for(int i=0;i<lost.length;i++) {
			for(int j=0;j<reserve.length;j++) {
				if(lost[i] == reserve[j]) {
					lost[i] = reserve[j] = -1;
					cnt1++;
					
					break;
				}
			}
		}
		
		// 여벌의 체육복 빌려주기
		int cnt2 = 0;
		for(int i=0;i<lost.length;i++) {
			for(int j=0;j<reserve.length;j++) {
				if(lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
					reserve[j] = -1;
					cnt2++;
					
					break;
				}
			}
		}
		
		return n - lost.length + cnt1 + cnt2;
	}
	
	public static void main(String[] args) {
		System.out.print(solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
	}
}