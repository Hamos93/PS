import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14909_양수개수세기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int answer = 0;
	
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) 
			if(0 < Integer.parseInt(st.nextToken())) answer ++;
		
		System.out.print(answer);
	}
}