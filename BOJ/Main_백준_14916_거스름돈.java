import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14916_거스름돈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int coin = Integer.MAX_VALUE;

		if(n % 5 == 0) coin = Math.min(coin, n / 5);
		if(n % 2 == 0) coin = Math.min(coin, n / 2);

		int div = n / 5;
		for(int i=div;0<=i;i--)
			if((n - (5 * i)) % 2 == 0) coin = Math.min(coin, i + (n - (5 * i)) / 2);

		if(coin == Integer.MAX_VALUE) System.out.print("-1");
		else System.out.print(coin);
	}
}