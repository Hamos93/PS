
public class Solution_L1_약수의합 {
    public static int solution(int n) {
        int answer = n;
        for(int i=1;i<=n/2;i++)
            if(n % i == 0) answer += i; 
        
        return answer;
    }
    
	public static void main(String[] args) {
		System.out.print(solution(12));
	}
}