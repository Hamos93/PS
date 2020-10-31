import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Solution_L1_완주하지못한선수 {
    public static String solution(String[] participant, String[] completion) {
    	Set<String> hashSet = new HashSet<>();
    	List<String> list = new ArrayList<>();
    	
    	for(int i=0;i<participant.length;i++) {
    		String name = participant[i];
    		
    		if(!hashSet.contains(name)) hashSet.add(name);
    		else list.add(name);
    	}
    	
    	for(int i=0;i<completion.length;i++) {
    		String name = completion[i];
    		
    		if(hashSet.contains(name)) hashSet.remove(name);
    		else list.remove(name);
    	}
    	
    	String answer = "";
    	if(!list.isEmpty()) answer = list.get(0);
    	else {
    		Iterator<String> iterator = hashSet.iterator();
    		while(iterator.hasNext()) answer = iterator.next();
    	}
    	
    	return answer;
    }
    
	public static void main(String[] args) {
		System.out.print(solution(new String[] { "mislav", "stanko", "mislav", "ana" }, new String[] { "stanko", "ana", "mislav" }));
	}
}