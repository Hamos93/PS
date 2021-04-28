import java.util.Arrays;

public class Solution_L1_로또의최고순위와최저순위 {
	public static int numCount(int[] lottos, int[] win_nums) {
		int cnt = 0;
		for(int i=0;i<6;i++) {
			int num = lottos[i];
		
			for(int j=0;j<6;j++) {
				if(num == win_nums[j]) {
					cnt++;
					break;
				}
			}
		}
		
		return cnt;
	}
	
	public static int findRank(int cnt) {
		int result = 0;
		
		if(cnt == 6) result =1;
		else if(cnt == 5) result = 2;
		else if(cnt == 4) result = 3;
		else if(cnt == 3) result = 4;
		else if(cnt == 2) result = 5;
		else result = 6;
		
		return result;
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
		int zero = 0;
		for(int num : lottos) {
			if(num == 0) zero++;
		}
		
		if(zero == 0) {
			int cnt = numCount(lottos, win_nums);
			int rank = findRank(cnt);
			
			return new int[] { rank, rank };
		}else {
			int cnt = numCount(lottos, win_nums);
			int rank1 = findRank(cnt + zero);
			int rank2 = findRank(cnt);

			return new int[] { rank1, rank2 };
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] { 44, 1, 0, 0, 31, 25 }, new int[] { 31, 10, 45, 1, 6, 19 })));
		System.out.println(Arrays.toString(solution(new int[] { 0, 0, 0, 0, 0, 0 }, new int[] { 38, 19, 20, 40, 15, 25 })));
		System.out.println(Arrays.toString(solution(new int[] { 45, 4, 35, 20, 3, 9 }, new int[] { 20, 9, 3, 45, 4, 35 })));
	}
}