import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2902_KMP는왜KMP일까 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] KMP = br.readLine().split("-");
	
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<KMP.length;i++)
			sb.append(KMP[i].charAt(0));
		
		System.out.print(sb.toString());
	}
}