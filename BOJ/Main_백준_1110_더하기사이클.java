import java.util.Scanner;

public class Main_백준_1110_더하기사이클 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int[] pCycle = new int[2];
		int N = sc.nextInt();
		
		if(N < 10){
			pCycle[0] = 0;
			pCycle[1] = N;
		}else{
			pCycle[0] = N/10;
			pCycle[1] = (N - pCycle[0] * 10);
		}
		
		int num1 = pCycle[0];
		int num2 = pCycle[1];
		int len = 0;
		
		while(true){
			int temp = pCycle[0] + pCycle[1];
			if(10 <= temp) temp %= 10;
			
			pCycle[0] = pCycle[1];
			pCycle[1] = temp;
			len++;
			
			if(num1 == pCycle[0] && num2 == pCycle[1]) break;
		}
	
		System.out.print(len);
	}
}