import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14910_오르막 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		boolean flag = true;
		int first = Integer.parseInt(st.nextToken());

		while(st.hasMoreTokens()){
			int second = Integer.parseInt(st.nextToken());
			
			if(second < first){
				flag = false;
				break;
			}
			
			first = second;
		}
	
		if(flag) System.out.print("Good");
		else System.out.print("Bad");
	}
}