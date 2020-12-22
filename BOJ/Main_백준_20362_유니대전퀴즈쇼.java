import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_20362_유니대전퀴즈쇼 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		String S = st.nextToken();
		String answer = "";
		
		Map<String, String> hashMap = new LinkedHashMap<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String nickname = st.nextToken(); 
			String chat = st.nextToken();
			
			if(nickname.equals(S)) answer = chat;
			
			hashMap.put(nickname, chat);
		}
		
		int cnt = 0;
		Set<String> keys = hashMap.keySet();
		Iterator<String> keyIterator = keys.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			String value = hashMap.get(key);
			
			if(key.equals(S)) break;
			if(value.equals(answer)) cnt++;
		}
		
		System.out.print(cnt);
	}
}