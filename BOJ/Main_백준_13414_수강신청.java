import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main_백준_13414_수강신청 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		/* LinkedHashSet: Set에 입력한 순서가 보장되는 클래스 */
		LinkedHashSet<String> set = new LinkedHashSet<>();
	
		while(0 < L--) {
			String studentID = br.readLine().trim();
			
			if(set.contains(studentID)) set.remove(studentID);
			set.add(studentID);
		}
		
		StringBuilder sb = new StringBuilder(); int idx = 0;
		for(String studentID : set) {
			if(idx == K) break;
			
			sb.append(studentID + "\n");
			idx++;
		}
		
		System.out.print(sb.toString());
	}
}