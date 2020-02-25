import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2083_럭비클럽 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String name = st.nextToken();
			int age = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
		
			if(name.charAt(0) == '#' && age == 0 && weight == 0) break;
			
			if(17 < age || 80 <= weight) System.out.println(name + " Senior");
			else System.out.println(name + " Junior");
		}
	}
}