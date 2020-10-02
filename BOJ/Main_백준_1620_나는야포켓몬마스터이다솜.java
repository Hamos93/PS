import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_백준_1620_나는야포켓몬마스터이다솜 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> hashMap = new HashMap<>();
		for(int i=1;i<=N;i++) {
			String name = br.readLine().trim();
			String num = Integer.toString(i); 
			
			hashMap.put(name, num);
			hashMap.put(num, name);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=M;i++) {
			String input = br.readLine().trim();
			sb.append(hashMap.get(input) + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}