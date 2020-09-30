import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_1920_수찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		Set<Integer> hashSet = new HashSet<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) hashSet.add(Integer.parseInt(st.nextToken()));
		
		st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if(hashSet.contains(num)) sb.append("1\n");
			else sb.append("0\n");
		}
				 
		System.out.print(sb.toString());
	}
}