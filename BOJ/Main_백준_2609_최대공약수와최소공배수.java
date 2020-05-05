import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
* [ 최대공약수 ( 유클리드 호제법 ) ]
* - a를 b로 나눈 나머지를 r이라고 했을 때 GCD(a, b) = GCD(b, r)
*   r이 0이면 이 때 b가 최대 공약수 
* - 예) GCD(24, 16) = GCD(16, 8) = GCD(8, 0) = 8
*/ 

/* 
* [ 최소공배수 ]
* - 최소공배수는 GCD를 응용해서 구할 수 있다.
*   두 수 A, B의 최대공약수를 G라고 했을 때, LCM = G * (A/G) * (B/G)
*/ 

public class Main_백준_2609_최대공약수와최소공배수 {
	private static int gcd(int a, int b){
		int r = 0;

		while(true){
			r = a % b;

			if(r == 0) break;

			a = b;
			b = r;
		}

		return b;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		if(N < M){
			int temp = N;
			N = M;
			M = temp;
		}

		int res = gcd(N, M);
		System.out.print(res + "\n" + (N * M / res));
	}
}