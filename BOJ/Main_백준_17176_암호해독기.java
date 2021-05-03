import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_백준_17176_암호해독기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		HashMap<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int key = Integer.parseInt(st.nextToken());
			
			if(!map.containsKey(key)) map.put(key, 1);
			else map.put(key, map.get(key) + 1);
		}
		
		char[] plainText = br.readLine().toCharArray();
		
		boolean flag = true;
		for(char ch : plainText) {
			if(ch == ' ') {
				if(!map.containsKey(0) || map.get(0) <= 0) {
					flag = false;
					break;
				}
				
				map.put(0, map.get(0) - 1);
			}else if('A' <= ch && ch <= 'Z') {
				if(!map.containsKey(ch - 64) || map.get(ch - 64) <= 0) {
					flag = false;
					break;
				}
				
				map.put(ch - 64, map.get(ch - 64) - 1);
			}else {
				if(!map.containsKey(ch - 70) || map.get(ch - 70) <= 0) {
					flag = false;
					break;
				}
				
				map.put(ch - 70, map.get(ch - 70) - 1);
			}
		}
		
		if(flag) System.out.print("y");
		else System.out.print("n");
	}
}