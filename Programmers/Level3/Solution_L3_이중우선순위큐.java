import java.util.Arrays;
import java.util.TreeMap;

public class Solution_L3_이중우선순위큐 {
	public static int[] solution(String[] operations) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i=0;i<operations.length;i++) {
			String[] operation = operations[i].split(" ");
			String command = operation[0];
			int num = Integer.parseInt(operation[1]);

			if(command.equals("I")) {
				if(map.containsKey(num)) map.put(num, map.get(num) + 1);
				else map.put(num, 1);
			}else {
				if(map.size() == 0) 
					continue;

				if(num == 1) {
					int key = map.lastKey();
					
					if(1 < map.get(key)) map.put(key, map.get(key) - 1);
					else map.remove(key);
				}else {
					int key = map.firstKey();
					
					if(1 < map.get(key)) map.put(key, map.get(key) - 1);
					else map.remove(key);
				}
			}
		}
		
		if(map.size() == 0) return new int[] { 0, 0 };
		else {
			if(map.size() == 1) return new int[] { map.firstKey(), map.firstKey() };
			else return new int[] { map.lastKey(), map.firstKey() };
		}
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "I 16", "D 1" })));
		System.out.println(Arrays.toString(solution(new String[] { "I 7", "I 5", "I -5", "D -1" })));
	}
}