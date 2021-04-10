import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Solution_L2_위장 {
	public static int solution(String[][] clothes) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		for(int i=0;i<clothes.length;i++) {
			if(!hashMap.containsKey(clothes[i][1])) hashMap.put(clothes[i][1], 1);
			else hashMap.put(clothes[i][1], hashMap.get(clothes[i][1]) + 1);
		}
		
		Set<String> keySet = hashMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		int answer = 1;
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			
			answer *= (hashMap.get(key) + 1);
		}
		
		return (answer - 1);
	}

	public static void main(String[] args) {
		String[][] clothes = {
				{ "yellowhat", "headgear" },
				{ "bluesunglasees", "eyewear" },
				{ "green_turban", "headgear" },
		};
		
		System.out.println(solution(clothes));
	}
}