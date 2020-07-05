
public class Solution_D3_3131_100만이하의모든소수 {
	public static void main(String[] args) {
		boolean[] prime = new boolean[1000001];
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2;i<=1000000;i++) {
			if(!prime[i]) {
				for(int j=i+i;j<=1000000;j+=i) {
					if(!prime[j]) prime[j] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=2;i<=1000000;i++) {
			if(!prime[i]) sb.append(i + " ");
		}
		
		System.out.print(sb.toString());
	}
}