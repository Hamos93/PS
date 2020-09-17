import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_15963_CASIO {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String N = st.nextToken();
		String M = st.nextToken();
	
		if(N.equals(M)) System.out.print("1");
		else System.out.print("0");
	}
}