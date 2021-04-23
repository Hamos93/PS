import java.util.Arrays;
import java.util.HashMap;

public class Solution_KAKAO_오픈채팅방 {
    public static String[] solution(String[] record) {
    	int len = 0;
    	for(String str : record) {
    		if(str.charAt(0) == 'E' || str.charAt(0) == 'L') len++;
    	}
    	
    	String[] answer = new String[len];
    	HashMap<String, String> hashMap = new HashMap<>();
    	
    	int idx = 0;
    	for(int i=0;i<record.length;i++) {
    		String[] line = record[i].split(" ");
    		char command = line[0].charAt(0);
    		String word = null;
    		
    		if(command == 'E') {
    			word = "*" + line[1];
    			answer[idx++] = word;

    			hashMap.put(line[1], line[2]);
    		}else if(command == 'L') {
    			word = "^" + line[1];
    			answer[idx++] = word;
    		}else hashMap.put(line[1], line[2]);
    	}
    	
    	for(int i=0;i<answer.length;i++) {
    		String word = answer[i];
    		String line = null;
    		
    		if(word.charAt(0) == '*') line = "님이 들어왔습니다.";
    		else line = "님이 나갔습니다.";
    		
    		String nickname = hashMap.get(word.substring(1));
    		
    		answer[i] = nickname + line;
    	}
    	
        return answer;
    }
    
    public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan" })));
	}
}