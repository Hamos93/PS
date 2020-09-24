/*
 * [그리디 알고리즘]
 * 전체를 고려하지 않고 그 순간에서의 최선을 선택하는 알고리즘
 */

import java.util.Scanner;

public class Main_백준_5585_거스름돈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		money = 1000 - money;
		
		int[] change = { 500, 100, 50, 10, 5, 1 };
		
		int idx = 0, cnt = 0;
		while(true) {
			if(money == 0) break;
			if(change[idx] <= money) {
				money -= change[idx];
				cnt++;
			}else idx++;
		}
		
		System.out.print(cnt);
	}
}