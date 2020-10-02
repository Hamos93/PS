import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_10815_숫자카드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");

		Set<Integer> hashSet = new HashSet<>();
		for(int i=1;i<=N;i++) {
			int value = Integer.parseInt(st.nextToken());
			
			hashSet.add(value);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=M;i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(hashSet.contains(value)) sb.append("1 ");
			else sb.append("0 ");
		}
		
		System.out.print(sb.toString().trim());
	}
}