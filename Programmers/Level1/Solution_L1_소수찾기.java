
public class Solution_L1_소수찾기 {
	public static int solution(int n) {
        boolean[] prime = new boolean[n + 1];
        prime[0] = true; prime[1] = true;
        
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                for(int j=i+i;j<=n;j+=i)
                    prime[j] = true;
            }
        }
    
        int answer = 0;
        for(int i=1;i<=n;i++)
            if(!prime[i]) answer++;
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.print(solution(10));
	}
}