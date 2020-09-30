import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_10546_배부른마라토너 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		Set<String> hashSet = new HashSet<>();
		List<String> list = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			String name = br.readLine().trim();
			
			if(hashSet.contains(name)) list.add(name);
			else hashSet.add(name);
		}

		for(int i=1;i<=N-1;i++) {
			String name = br.readLine().trim();
			
			if(hashSet.contains(name)) hashSet.remove(name);
			else list.remove(name);
		}
		
		if(!hashSet.isEmpty()) {
			for(String name : hashSet)
				System.out.print(name);
		}else System.out.print(list.get(0));
	}
}