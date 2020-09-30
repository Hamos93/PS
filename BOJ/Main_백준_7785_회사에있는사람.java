import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_백준_7785_회사에있는사람 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		TreeSet<String> treeSet = new TreeSet<>();
		
		while(0 < n--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String name = st.nextToken();
			String log = st.nextToken();
			
			if(log.equals("enter")) treeSet.add(name);
			else treeSet.remove(name);
		}
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<String> iterator = treeSet.descendingIterator();
		while(iterator.hasNext()) sb.append(iterator.next() + "\n");
		
		System.out.print(sb.toString());
	}
}