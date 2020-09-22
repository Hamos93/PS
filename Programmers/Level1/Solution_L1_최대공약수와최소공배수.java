import java.util.Arrays;

public class Solution_L1_최대공약수와최소공배수 {
    public static int[] solution(int n, int m) {
        int gcd = 0, a = n, b = m;
        
        while(true){
            int r = a % b;
            
            if(r == 0){
                gcd = b;
                break;
            }else{
                a = b;
                b = r;
            }
        }
        
        int lcm = (n * m) / gcd;
        
        int[] answer = { gcd, lcm };     
        
        return answer;
    }
    
	public static void main(String[] args) {
		System.out.print(Arrays.toString(solution(3, 12)));
	}
}