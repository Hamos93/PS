import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_백준_10867_중복빼고정렬하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		Set<Integer> set = new TreeSet<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			set.add(Integer.parseInt(st.nextToken()));
		
		StringBuilder sb = new StringBuilder();
		for(int value:set)
			sb.append(value + " ");
		
		System.out.print(sb.toString());
	}
}