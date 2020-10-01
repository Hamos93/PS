import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_1269_대칭차집합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		HashMap<Integer, Integer> hashMapA = new HashMap<>();
		HashMap<Integer, Integer> hashMapB = new HashMap<>();
	
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=A;i++) {
			int key = Integer.parseInt(st.nextToken());
			
			hashMapA.put(key, 1);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=B;i++) {
			int key = Integer.parseInt(st.nextToken());
			
			hashMapB.put(key, 1);
		}
		
		int cnt = 0;
		
		Set<Integer> keySet = hashMapA.keySet();
		Iterator<Integer> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			int key = keyIterator.next();
			
			if(hashMapA.containsKey(key) && hashMapB.containsKey(key)) cnt++;
		}

		System.out.print((A - cnt) + (B - cnt));
	}
}