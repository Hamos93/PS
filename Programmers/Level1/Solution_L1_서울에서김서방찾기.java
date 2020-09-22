
public class Solution_L1_서울에서김서방찾기 {
    public static String solution(String[] seoul) {
        int x = 0;
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                x = i;
                break;
            }
        }
        
        String answer = "김서방은 " + x + "에 있다";
        return answer;
    }
    
	public static void main(String[] args) {
		System.out.print(solution(new String[] { "Jane", "Kim" }));
	}
}